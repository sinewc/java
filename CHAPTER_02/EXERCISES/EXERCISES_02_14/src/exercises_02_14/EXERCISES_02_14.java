
package exercises_02_14;
import java.util.Scanner;

public class EXERCISES_02_14 {
    public static void main(String[] args) {
       System.out.println("---Health application: computing BMI---");
       Scanner input =new Scanner(System.in);
       
       System.out.print("Enter weight  in pounds : ");
       double pounds = input.nextDouble();
       System.out.print("Enter height in inches : ");
       double inches = input.nextDouble();
       
       double kilograms = pounds*0.45359237;
       double meters = (inches*0.0254);
       double bmi=kilograms/meters;
       System.out.print("BMI is "+bmi);
       
    }
    
}
