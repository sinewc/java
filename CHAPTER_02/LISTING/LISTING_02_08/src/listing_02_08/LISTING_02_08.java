
package listing_02_08;
import java.util.Scanner;
public class LISTING_02_08 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter purchase amount : ");
      double purchaseAmount=input.nextDouble();
      
      double tax=purchaseAmount*0.06;
       System.out.print("Sales tax is $ "+(int)(tax*100)/100.0);   
    }    
}
