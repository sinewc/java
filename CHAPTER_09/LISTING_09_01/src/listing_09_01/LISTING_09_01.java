
package listing_09_01;
import java.util.Scanner;
public class LISTING_09_01 {
    public static void main(String[] args) {
        //Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getPerimeter());
        
        //Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getPerimeter());
        
        //Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getPerimeter());
        
        //Modify circle radius 
        circle2.radius = 100;
        System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getPerimeter());
        
    }
    
}

//Difine the circle class with two constructor
class SimpleCircle{
    double radius;
    
    //Construct a cricle with radius 1
    SimpleCircle(){
        radius = 1;
    }
    
    //Construct a circle with a specified radius
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    
    //Return the area of this circle
    double getArea(){
        return radius * radius * Math.PI;
    }
    
    //Return the perimeter of this circle
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double newRadius){
        radius = newRadius;
    }
}