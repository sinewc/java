import java.lang.Math;
public class Circle 
extends GeometricObject{
    
  double radius;
  
  public Circle(){
      
  }
  
  public Circle(double radius){
      this.radius=radius;
      
  }

    
  

    @Override
    public double getArea() {
   return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
      return Math.PI*2*radius;  
    }
   
}
