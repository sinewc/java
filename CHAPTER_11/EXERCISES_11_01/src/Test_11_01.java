import java.util.Scanner;
public class Test_11_01 {
    public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides of the triangle
		System.out.print("Enter three coordinate of the triangle ");
                System.out.print("\npoint 1 :");
		double x1 = input.nextDouble();	
                double y1 = input.nextDouble();
                System.out.print("point 2 :");
		double x2 = input.nextDouble();	
                double y2 = input.nextDouble();
                System.out.print("point 3 :");
		double x3 = input.nextDouble();	
                double y3 = input.nextDouble();

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create triangle object with user input
		Triangle triangle = new Triangle(x1,y1,x2,y2,x3,y3){};
		triangle.setColor(color);
		triangle.setFilled(filled);
                triangle.getSide1();
                triangle.getSide2();
                triangle.getSide3();
               

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") + " filled");
                System.out.println(triangle.getDateCreated());
	}
}
