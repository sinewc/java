
package exercises_01_08;
import java.util.Scanner;
public class EXERCISES_01_08 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("---Area and  perimeter of a circle---");
       System.out.print("Enter radius = " );
       float radius = input.nextFloat();
       System.out.println("perimeter = "+2*radius*3.14159);
       System.out.print("area = "+radius*radius*3.14159);
    }
    
}
