
package listing_02_10;
import java.util.Scanner;
public class LISTING_02_10 {
     public static void main(String[] args) {
      //Create a Scanner
      Scanner input = new Scanner(System.in);
      
      //Receive the amount
      System.out.print("Enter an amount in double, for example 11.56 : ");
      double amount = input.nextDouble();
      
      int remainingAmount = (int)(amount * 100);
      
      //Find the number of one dollars
      int numberOfOneDollars = remainingAmount/100;
          remainingAmount = remainingAmount%100;
          
      //Find the niumber of quarters in the remaining amount
      int numOfQuarters = remainingAmount/25;
          remainingAmount = remainingAmount%25;
          
      //Find the number of dimes in the remainig amount
      int numberOfDimes = remainingAmount/10;
          remainingAmount = remainingAmount%10;
          
      //Find the number of nickels in the remainig amount
      int numberOfNickels = remainingAmount/5;
          remainingAmount = remainingAmount%5;
          
      //Find the number of pennies in the remaining amount
      int numberOfPennies = remainingAmount;
      
      //Display results
      System.out.println("Your amount "+amount+" consists of");
      System.out.println("      "+numberOfOneDollars+" dollars");
      System.out.println("      "+numOfQuarters+" quarters");
      System.out.println("      "+numberOfDimes+" dimes");
      System.out.println("      "+numberOfNickels+" nickels");
      System.out.println("      "+numberOfPennies+" pennies");
      
    }
    
}
