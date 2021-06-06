
package exercises_02_09;
import java.util.Scanner;
public class EXERCISES_02_09 {
    public static void main(String[] args) {
       System.out.println("---Physics: acceleration---");
       Scanner input =new Scanner(System.in);
       
       System.out.print("Ener v0, v1 and t : ");
       float v0=input.nextFloat();
       float v1=input.nextFloat();
       float t=input.nextFloat();
       
       //compute a
       float a=(v1-v0)/t;
       System.out.print("The average acceleration is "+a);
    }
    
}
