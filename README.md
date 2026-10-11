# Ananya Jain — Portfolio

My personal portfolio site: a single-page, dark-themed site built with plain HTML, CSS, and JavaScript, featuring a live 3D hero scene built with [Three.js](https://threejs.org/).

**Live site:** [ananya052004-maker.github.io/Latest_portfolio](https://ananya052004-maker.github.io/Latest_portfolio/)

## Features

- **3D hero scene** — a rotating wireframe icosahedron with orbiting satellite shapes, built with Three.js, that tilts toward the cursor.
- **Scroll-reveal animations** — sections fade and slide into view as you scroll, using the native `IntersectionObserver` API.
- **3D tilt-on-hover project cards** — project cards tilt in perspective toward the cursor.
- **Single-accent, professional dark theme** — one consistent accent color throughout, no external UI framework.
- **Fully responsive** — works down to mobile widths, with a collapsible nav menu.

## Sections

- About
- Experience
- Projects
- Skills
- Education
- Achievements
- Contact

## Tech Stack

- HTML5 / CSS3 (no framework)
- Vanilla JavaScript
- [Three.js](https://threejs.org/) (via CDN) for the 3D hero scene

## Project Structure

```
.
├── index.html   # Page structure and content
├── ana.css      # All styling (theme, layout, animations)
├── script.js    # Three.js hero scene, scroll reveal, nav, card tilt
└── img777.png   # Profile photo

Certificate images (cer1.png, cer2.png) referenced in the Achievements
section are optional — if absent, they're hidden gracefully instead of
showing a broken image.
```

## Running Locally

No build step required — just open `index.html` in a browser, or serve the folder with any static file server:

```bash
python3 -m http.server 8000
```

Then visit `http://localhost:8000`.

## Deployment

A static site with no build step, hosted on GitHub Pages, deploying automatically from the `main` branch.
