
package listing_02_05;
import java.util.Scanner;
public class LISTING_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt the user for imput
        System.out.print("Enter an integer for seconds : ");
        int seconds = input.nextInt();
        
        //Compute minutes
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        
        //Display result
        System.out.print(seconds + " seconds is "+minutes+" minutes is "+remainingSeconds+" seconds");
    }
    
}
