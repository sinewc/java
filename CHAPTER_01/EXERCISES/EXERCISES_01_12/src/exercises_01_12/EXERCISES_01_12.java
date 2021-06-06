
package exercises_01_12;
import java.util.Scanner;
public class EXERCISES_01_12 {
    public static void main(String[] args) {
        System.out.println("---Average speed in kilometers---");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter miles : ");
        double miles=input.nextInt();
        System.out.print("Enter hour : ");
        double hour=input.nextInt();
        System.out.print("Enter minutes : ");
        double minutes=input.nextInt();
        System.out.print("Enter seconds : ");
        double seconds=input.nextInt();
        
        //calculation
        double totletime=hour+(minutes/60)+(seconds/3600);
        double kilometers=miles*1.6;
        double average=kilometers/totletime;
        System.out.println("The average speed in kilometers per hour = "+average);
        
        
    }
    
}
