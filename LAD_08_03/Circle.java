import java.lang.Math;

public class Circle 
    extends Geometry  {
    private double radius;
    public String getRadius;
    

    public Circle() {
    }

    public Circle(String name,double radius,String color) {
        super(name, color);
        this.radius = radius;
        
    }
     
 
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    

    public double getArea() {
        return Math.PI*radius*radius;
         }


   

    

}
