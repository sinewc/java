
package listing_02_06;
import java.util.Scanner;
public class LISTING_02_06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter a degree in Fahrenhite : ");
        double fahrenheit = input.nextDouble();
        
        //Convert Fahrenheit to Celsius
        double celsius =(5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit "+ fahrenheit+" is "+celsius+" in Celsius");
       
    }
    
}
