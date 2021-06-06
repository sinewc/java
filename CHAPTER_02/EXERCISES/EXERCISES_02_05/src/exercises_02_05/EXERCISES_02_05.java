
package exercises_02_05;
import java.util.Scanner;
public class EXERCISES_02_05 {
    public static void main(String[] args) {
       System.out.println("---Financial application: calulate tips---");
       Scanner input=new Scanner(System.in);
       
       System.out.print("Enter the sudtotal and gratuity rate : ");
       float subtotal=input.nextFloat();
       float totalGratuity = input.nextFloat();
       
       float gratuity=(float)((totalGratuity*10)/100);
       System.out.print("The gratuity is $"+gratuity+" and total is $"+(subtotal+gratuity));
    }
    
}
