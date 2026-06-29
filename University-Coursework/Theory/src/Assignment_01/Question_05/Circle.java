package Assignment_01.Question_05;

public class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
