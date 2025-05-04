import java.util.Scanner;
class Shape {
    public Shape() {
    }

    public float area() {
        return 0;
    }
}
class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) (Math.PI * radius * radius); // Area of circle: π * r^2
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float area() {
        return length * width;     
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float radius = scanner.nextFloat();
        Circle circle = new Circle(radius);
        float circleArea = circle.area();
        System.out.println("The area of the circle is " + circleArea);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, width);
        float rectangleArea = rectangle.area();
        System.out.println("The area of the rectangle is " + rectangleArea);

        scanner.close();
    }
}