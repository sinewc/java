
public class Rectangle extends Geometry {

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(String name,double width, double height,String color) {
        super(name,color);
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    

    public double getPerimeter() {
        double result = 0;
        result = 2 * this.width + 2 * this.height;
        return result;
    }

    @Override
    public double getArea() {
        double result;
        result = width * height;
        return result;
    }

   


 

}
