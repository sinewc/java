import java.util.Scanner;
public class testRegularPolygon {
    public static void main(String[] args) {
                int n=0;
                double side=0,x=0,y=0;
                Scanner input=new Scanner(System.in);
        
		// Create three RegularPolygon objects
		RegularPolygon regularPolygon1 = new RegularPolygon();
                // Display perimeter and area of each object
		System.out.println("--------------------------------------------------");
		System.out.println(" Regular Polygon Objects : 1 "  );
		System.out.println(" Perimeter : "+regularPolygon1.getPerimeter());
                System.out.println(" Area : "+ regularPolygon1.getArea());
                System.out.println("--------------------------------------------------");
                
                System.out.print("Enter n :" );
                     n = input.nextInt();
                System.out.print("Enter side :" );
                     side = input.nextDouble();
                
                     
                RegularPolygon regularPolygon2 = new RegularPolygon(n, side);
                System.out.println("--------------------------------------------------");
		System.out.println(" Regular Polygon Objects : 2 "  );
		System.out.println(" Perimeter : "+regularPolygon2.getPerimeter());
                System.out.println(" Area : "+ regularPolygon2.getArea());
                System.out.println("--------------------------------------------------");
                
                 System.out.print("Enter n :");
                     n = input.nextInt();
                System.out.print("Enter side :" );
                     side = input.nextDouble();
                System.out.print("Enter x :" );
                     x = input.nextDouble();
                System.out.print("Enter y :" );
                     y = input.nextDouble(); 
                     
		RegularPolygon regularPolygon3 = new RegularPolygon(n, side, x, y);
		System.out.println("--------------------------------------------------");
		System.out.println(" Regular Polygon Objects : 3 "  );
		System.out.println(" Perimeter : "+regularPolygon3.getPerimeter());
                System.out.println(" Area : "+ regularPolygon3.getArea());
                System.out.println("--------------------------------------------------");
                
	}
}
