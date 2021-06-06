
public class Rectangles
        extends GeometricObject {

    double a, b;

    public Rectangles() {

    }

    public Rectangles(double a, double b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

}
