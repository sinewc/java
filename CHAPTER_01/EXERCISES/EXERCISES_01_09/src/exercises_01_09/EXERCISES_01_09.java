
package exercises_01_09;
import java.util.Scanner;
public class EXERCISES_01_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("---Area ans perimeter of a rectangle---");
        System.out.print("Enter width = ");
        float width =input.nextFloat();
        System.out.print("Enter height = ");
        float height=input.nextFloat();
        System.out.print("area =" +width*height);
    }
    
}
