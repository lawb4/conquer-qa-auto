package consulting.hw2.classes;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public void printRectangleInfo() {
        System.out.printf("Прямоугольник: Ширина = %.2f, Высота = %.2f, Площадь = %.2f, Периметр = %.2f", this.width, this.height, this.calculateArea(), this.calculatePerimeter());
    }
}
