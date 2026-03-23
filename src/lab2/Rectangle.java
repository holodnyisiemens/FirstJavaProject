package lab2;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public void setLength(double length) {
        if (length > 0) { // проверка на корректное значение
            this.length = length;
        }
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    // Метод для вычисления площади
    public double getArea() {
        return length * width;
    }
    // Метод для вычисления периметра
    public double getPerimeter() {
        return 2 * (length + width);
    }
}