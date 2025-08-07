import java.util.Scanner;

public class cole<T extends Number> {
    private T width;
    private T height;

    public cole(T width, T height) {
        this.width = width;
        this.height = height;
    }

    public double calculateSum() {
        return width.doubleValue() + height.doubleValue();
    }

    public T getWidth() {
        return width;
    }

    public T getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        
        System.out.println("Enter the height of the rectangle:");
        double height = scanner.nextDouble();
        
        cole<Double> area = new cole<>(width, height);
        
        System.out.println("Sum of dimensions: " + area.calculateSum());
        
        scanner.close();
    }
}
