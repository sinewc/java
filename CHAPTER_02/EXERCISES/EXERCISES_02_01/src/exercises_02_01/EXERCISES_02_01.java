
package exercises_02_01;
import java.util.Scanner;
public class EXERCISES_02_01 {
    public static void main(String[] args) {
        System.out.println("---Convert Cesius to Fahrenheit---");
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter a degree in Celsius : ");
       double celsius = input.nextDouble();
       
       double fahrenheit = (9.0/5)*celsius+32;
       System.out.print((int)celsius+" Celsius is "+fahrenheit+" Fahrenheit ");
    }
    
}
