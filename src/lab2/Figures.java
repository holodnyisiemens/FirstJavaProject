package lab2;

// общий интерфейс
interface Shape {
    double getArea();
    double getPerimeter();
}

// круг
class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
}

// квадрат
class Square implements Shape {
    private double side;
    public Square(double side) { this.side = side; }
    public double getArea() { return side * side; }
    public double getPerimeter() { return 4 * side; }
}

// треугольник
class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
