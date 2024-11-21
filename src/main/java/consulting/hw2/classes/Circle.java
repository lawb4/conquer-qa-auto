package consulting.hw2.classes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2d);
    }

    public void printCircleInfo() {
        System.out.printf("Радиус = %.2f, Площадь = %.2f, Длина окружности = %.2f",
                this.radius,
                this.calculateArea(),
                this.calculateCircumference());
    }
}
