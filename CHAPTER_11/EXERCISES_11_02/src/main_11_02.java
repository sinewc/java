
import java.util.Scanner;
import java.util.ArrayList;
public class main_11_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sineinput;
        double a,b,c;
        System.out.println("Enter radius circle 1 :");
        sineinput = Double.parseDouble(input.nextLine());
        Circle circle1 = new Circle(sineinput);

        System.out.println("Enter radius circle 2 :");
        sineinput = Double.parseDouble(input.nextLine());
        Circle circle2 = new Circle(sineinput);

        System.out.println("Enter rectangle 1's height : ");
        a=Double.parseDouble(input.nextLine());
        System.out.println("Enter rectangle 1's width : ");
        b=Double.parseDouble(input.nextLine());
        Rectangles r1 = new Rectangles(a,b);
        
        
        System.out.println("Enter rectangle 2's lenght:");
         a=Double.parseDouble(input.nextLine());
        System.out.println("Enter rectangle 2's width : ");
        b=Double.parseDouble(input.nextLine());
        Rectangles r2 = new Rectangles(a,b);
        
        
        
        System.out.print("Enter three coordinate of the triangle ");
                System.out.print("\npoint 1 :");
		double x1 = Double.parseDouble(input.nextLine());	
                double y1 = Double.parseDouble(input.nextLine());
                System.out.print("point 2 :");
		double x2 = Double.parseDouble(input.nextLine());
                double y2 = Double.parseDouble(input.nextLine());
                System.out.print("point 3 :");
		double x3 = Double.parseDouble(input.nextLine());
                double y3 = Double.parseDouble(input.nextLine());
                
        Triangle triangle = new Triangle(x1,y1,x2,y2,x3,y3);
        
        ArrayList<GeometricObject>wc= new ArrayList<GeometricObject>();
        
        wc.add(circle1);
        wc.add(circle2);
        wc.add(r1);
        wc.add(r2);
        wc.add(triangle);
        
        System.out.println("area of circle 1: "+circle1.getArea());
        System.out.println("area of circle 2: "+circle2.getArea());
        System.out.println("area of triangle 1 :"+triangle.getArea());
        System.out.println("area of Rectangle 1:"+r1.getArea());
        System.out.println("area of Rectangle 2:"+r2.getArea());
        
        System.out.println(" sum of the area is : "+GeometricObject.sumArea(wc));
     
        
    }

}
