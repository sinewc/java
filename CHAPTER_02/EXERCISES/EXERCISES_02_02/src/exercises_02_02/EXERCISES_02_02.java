
package exercises_02_02;
import java.util.Scanner;
public class EXERCISES_02_02 {
    public static void main(String[] args) {
        System.out.println("---Compute the volume of a cylinder---");
        Scanner input = new Scanner(System.in);
        final double PI=3.14159;
        
        System.out.print("Enter the radius and length of a cylinder : ");
        double radius =input.nextDouble();
        double lenght =input.nextDouble();
        
        double area = radius*radius*PI;
        double volume = area * lenght;
        
        System.out.println("The area is "+(float)area);
        System.out.println("The vplume is "+(float)volume);
    }
    
}
