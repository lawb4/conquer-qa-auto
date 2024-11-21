package consulting.hw2.classes;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double s = (a + b + c) / 2d;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void printTriangleInfo() {
        System.out.printf("Стороны: %.2f, %.2f, %.2f;\nПериметр: %.2f;\nПлощадь: %.2f", this.a, this.b, this.c, this.calculatePerimeter(), this.calculateArea());
    }
}
