
package bmi;
import java.util.Scanner;
public class BMI {
      public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
         System.out.print("Enter weight in pounds: ");
        double w = input1.nextDouble();
        double weight = w * 0.45359237;
       
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter height in inches: ");
        double h = input2.nextDouble();
        double height = h * 0.0254;

        double bmi = (weight) / (height * height);
         System.out.println(bmi);
      }
  
}
