
package exercises_02_12;
import java.util.Scanner;
public class EXERCISES_02_12 {
    public static void main(String[] args) {
        System.out.println("---Physics:finding runway length---");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter speed and acceleration : ");
        float speed = input.nextFloat();
        float acceleration=input.nextFloat();
        
        //compput lenght
        float lenght = (speed*speed)/(2*acceleration);
        System.out.print("The minimum runway length for this airplane is "+lenght);
    }
    
}
