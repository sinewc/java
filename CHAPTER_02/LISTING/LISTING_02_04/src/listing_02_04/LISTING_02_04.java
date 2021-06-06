
package listing_02_04;
import java.util.Scanner;
public class LISTING_02_04 {
    public static void main(String[] args) {
        final double PI = 3.14159;//Declare a constant
        
        //Create a Scannner object
        Scanner input = new Scanner (System.in);
        
        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius : ");
        double radius =input.nextDouble();
        
        //compute area
        double area = radius+radius*PI;
        
        //Display result
        System.out.print("The area forthe  criicle of radius "+radius+" is "+area);
    }
    
}
