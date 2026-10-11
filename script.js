/* ---------- Mobile nav ---------- */

const navToggle = document.getElementById('navToggle');
const navLinks = document.getElementById('navLinks');

navToggle.addEventListener('click', () => {
    navLinks.classList.toggle('open');
});

navLinks.querySelectorAll('a').forEach(link => {
    link.addEventListener('click', () => navLinks.classList.remove('open'));
});

/* ---------- Scroll reveal ---------- */

const revealObserver = new IntersectionObserver(entries => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add('visible');
            revealObserver.unobserve(entry.target);
        }
    });
}, { threshold: 0.15 });

document.querySelectorAll('.reveal').forEach(el => revealObserver.observe(el));

/* ---------- 3D tilt on project cards ---------- */

document.querySelectorAll('.tilt-card').forEach(card => {
    card.addEventListener('mousemove', e => {
        const rect = card.getBoundingClientRect();
        const x = (e.clientX - rect.left) / rect.width - 0.5;
        const y = (e.clientY - rect.top) / rect.height - 0.5;
        card.style.transform = `perspective(700px) rotateY(${x * 12}deg) rotateX(${-y * 12}deg) translateY(-4px)`;
    });
    card.addEventListener('mouseleave', () => {
        card.style.transform = 'perspective(700px) rotateY(0deg) rotateX(0deg) translateY(0)';
    });
});

/* ---------- Three.js hero scene ---------- */

(function initHero() {
    const canvas = document.getElementById('heroCanvas');
    if (!canvas || typeof THREE === 'undefined') return;

    const accent = 0x4f8cff;
    const scene = new THREE.Scene();
    const camera = new THREE.PerspectiveCamera(50, canvas.clientWidth / canvas.clientHeight, 0.1, 100);
    camera.position.z = 7;

    const renderer = new THREE.WebGLRenderer({ canvas, alpha: true, antialias: true });
    renderer.setPixelRatio(Math.min(window.devicePixelRatio, 2));

    function resize() {
        const width = canvas.clientWidth;
        const height = canvas.clientHeight;
        renderer.setSize(width, height, false);
        camera.aspect = width / height;
        camera.updateProjectionMatrix();
    }

    const mainGeo = new THREE.IcosahedronGeometry(2.1, 1);
    const mainEdges = new THREE.EdgesGeometry(mainGeo);
    const mainLines = new THREE.LineSegments(mainEdges, new THREE.LineBasicMaterial({ color: accent, transparent: true, opacity: 0.85 }));
    const mainFill = new THREE.Mesh(mainGeo, new THREE.MeshBasicMaterial({ color: accent, transparent: true, opacity: 0.04 }));
    const mainGroup = new THREE.Group();
    mainGroup.add(mainLines, mainFill);
    scene.add(mainGroup);

    const satellites = [];
    const satelliteSpecs = [
        { size: 0.5, x: -4.2, y: 1.6, z: -2, speed: 0.6 },
        { size: 0.35, x: 4, y: -1.4, z: -1.5, speed: 0.9 },
        { size: 0.6, x: 3.6, y: 2, z: -3, speed: 0.4 },
        { size: 0.3, x: -3.4, y: -2, z: -2.5, speed: 1.1 }
    ];
    satelliteSpecs.forEach(spec => {
        const geo = new THREE.TetrahedronGeometry(spec.size, 0);
        const edges = new THREE.EdgesGeometry(geo);
        const lines = new THREE.LineSegments(edges, new THREE.LineBasicMaterial({ color: accent, transparent: true, opacity: 0.5 }));
        lines.position.set(spec.x, spec.y, spec.z);
        scene.add(lines);
        satellites.push({ mesh: lines, speed: spec.speed, baseY: spec.y });
    });

    let mouseX = 0;
    let mouseY = 0;
    window.addEventListener('mousemove', e => {
        mouseX = (e.clientX / window.innerWidth) * 2 - 1;
        mouseY = (e.clientY / window.innerHeight) * 2 - 1;
    });

    let targetRotX = 0;
    let targetRotY = 0;
    const clock = new THREE.Clock();

    function animate() {
        requestAnimationFrame(animate);
        const t = clock.getElapsedTime();

        mainGroup.rotation.y += 0.0032;
        mainGroup.rotation.x += 0.0012;
        targetRotX = mouseY * 0.3;
        targetRotY = mouseX * 0.3;
        mainGroup.rotation.x += (targetRotX - mainGroup.rotation.x) * 0.02;
        mainGroup.rotation.y += (targetRotY - mainGroup.rotation.y) * 0.02;

        satellites.forEach((s, i) => {
            s.mesh.rotation.x += s.speed * 0.01;
            s.mesh.rotation.y += s.speed * 0.008;
            s.mesh.position.y = s.baseY + Math.sin(t * s.speed + i) * 0.3;
        });

        renderer.render(scene, camera);
    }

    resize();
    window.addEventListener('resize', resize);
    animate();
})();
