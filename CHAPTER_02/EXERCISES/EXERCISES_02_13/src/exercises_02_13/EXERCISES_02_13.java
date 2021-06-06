
package exercises_02_13;
import java.util.Scanner;
public class EXERCISES_02_13 {
    public static void main(String[] args) {
        System.out.println("---Financial application: compound value---");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount : ");
        float money = input.nextFloat();
        
        //compute monthly saving amountin 6 month
        //1 year
        float annualInterestRate = (float) ((1+(0.05/12))*money);
        
        for(int i=2;i<=6;i++){
            annualInterestRate= (float) ((1+(0.05/12))*(money+annualInterestRate));
        }      
              
        System.out.println("After the sixth mouth,The account value is "+annualInterestRate);
    }
    
}
