package mateusz.interfaces;

public class Circle implements Shape {

    private double a;

    private final double PI = 3.14;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double countCircumference() {
        int firstNumber = 10;

        firstNumber = firstNumber + 2;

        firstNumber += 2;



        return 2 * PI * a;
    }

    @Override
    public double countArea() {
        return PI * a * a;
    }
}
