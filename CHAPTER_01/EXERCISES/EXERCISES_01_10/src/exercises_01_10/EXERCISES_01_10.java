
package exercises_01_10;
import java.util.Scanner;
public class EXERCISES_01_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("---Average speed in miles---");
        System.out.print("Enter kilometers = ");
        double kilometers=input.nextFloat();
        System.out.print("Enter hour = ");
        double hour =input.nextInt();
        System.out.print("Enter minutes = ");
        double minutes =input.nextInt();
        System.out.print("Enter seconds = ");
        double seconds=input.nextInt();
        
        //calculation
        double totaltime=hour+(minutes/60)+(seconds/3600);
        double miles=kilometers/1.6;
        double average=(miles/totaltime);
        System.out.println("The averege speed in miles per hour = "+average);
      
        
    }
    
}
