package findfuture;
import java.util.Scanner;
public class Findfuture {
   public static void main(String[] args) {
       Scanner input =new Scanner (System.in); 
       System.out.print("Enter today's day :");
       int day =input.nextInt();
       
       System.out.print("Enter  thenumber of day elapsed sine to day : ");
       int elapsed =input.nextInt();
       
       //calculetor find future dates
       int futureday = (day+elapsed)%7; 
       System.out.print("Today is " ); 
       printday(day);
       System.out.print(" and the future day is " );
       printday(futureday);
       //System.out.print("Today is "+ printday(day)+"and the future day is"+printday(future));  
   }

    public static int printday(int input){
        switch(input){
                case 0:System.out.print("Sunday");break;
                case 1:System.out.print("Monday");break;
                case 2:System.out.print("Tuesday");break;
                case 3:System.out.print("Wednesday");break;
                case 4:System.out.print("Thursday");break;
                case 5:System.out.print("Friday");break;
                case 6:System.out.print("Saturday");
        } 
     return input;
    }
}