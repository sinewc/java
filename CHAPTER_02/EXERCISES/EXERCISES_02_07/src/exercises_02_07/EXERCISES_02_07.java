
package exercises_02_07;
import java.util.Scanner;
public class EXERCISES_02_07 {
    public static void main(String[] args) {
        System.out.println("---find the number of years---");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the number of minutes : ");
        int minutes=input.nextInt();
        
        //compute year and day
        int hour=minutes/60;
        int day = hour/24;
        int year=day/365;
        int year1=day%365;
        System.out.print(" minutes is approximately "+year+" year and "+year1+" day ");
                
    }
    
}
