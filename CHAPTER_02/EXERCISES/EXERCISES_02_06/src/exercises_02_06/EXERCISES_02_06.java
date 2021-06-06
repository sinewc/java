
package exercises_02_06;
import java.util.Scanner;
public class EXERCISES_02_06 {
    public static void main(String[] args) {
      System.out.println("---Sum the digits in an integer--");
      Scanner input=new Scanner(System.in);
      
      System.out.print("Enter a number between 0 and 1000 : ");
      int digit=input.nextInt();
      //compute sum suck as 923
      int sum=digit/100;//digit 1 =9
      int sum1=digit/10;//
      int sum2=sum1%10;//digit 2 = 2
      int sum3=digit%10;//digit 3 = 3
      System.out.print("The sum of the digits is "+(sum+sum2+sum3));
    }
    
}
