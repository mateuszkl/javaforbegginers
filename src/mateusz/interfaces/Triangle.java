package mateusz.interfaces;

public class Triangle implements Shape {

    private double a;

    private double b;

    private double c;

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

    @Override
    public double countCircumference() {
        return a + b + c;
    }

    @Override
    public double countArea() {
        return 0.5 * a * c;
    }
}
