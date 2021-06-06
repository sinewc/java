
package exercises_02_08;
import java.util.Scanner;
public class EXERCISES_02_08 {
    public static void main(String[] args) {
        System.out.println("---Current time---");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the time sone offset to GMT : ");
        long time =input.nextLong();
             time = System.currentTimeMillis();
                 
        System.out.print("The current time is "+time);
        
    }
    
}
