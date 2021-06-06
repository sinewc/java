public class Rectangle {

    private double widht, height;

    public Rectangle() {
    
    }

    public Rectangle(double a){
        widht=a;
    }

    public Rectangle(double widht, double height) {
        this.height = height;
        this.widht = widht;

    }

    public double getHeight() {
        return height;
    }

    public double getWidht() {
        return widht;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getArea() {
        double area;
        area = this.height * this.widht;
        return area;
    }

    public double getPerimeter() {
        return 2 * height + 2 * widht;
    }
    public void callname(){
        System.out.println("abhfihkfuck");
    }
}