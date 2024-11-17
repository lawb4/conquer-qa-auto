package consulting.hw2;

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
        System.out.printf("Стороны: %s, %s, %s;\nПериметр: %s;\nПлощадь: %s",
                String.format("%.2f", this.a),
                String.format("%.2f", this.b),
                String.format("%.2f", this.c),
                String.format("%.4f", this.calculatePerimeter()),
                String.format("%.4f", this.calculateArea()));
    }
}
