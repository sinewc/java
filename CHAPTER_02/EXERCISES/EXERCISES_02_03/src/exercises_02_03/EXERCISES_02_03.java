
package exercises_02_03;
import java.util.Scanner;
public class EXERCISES_02_03 {
    public static void main(String[] args) {
       System.out.println("---Convert feet into meters---");
       Scanner input=new Scanner(System.in);
       
       System.out.print("Enter a value for feet : ");
       float feet = input.nextFloat();
       
       //compute meters
       float meters = (float)(feet*0.305);
       
       //Dissplay results
       System.out.print(feet+" feet is "+ meters + " meters ");
       
       
       
    }
    
}
