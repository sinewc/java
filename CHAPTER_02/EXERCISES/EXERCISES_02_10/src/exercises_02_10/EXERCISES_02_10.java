
package exercises_02_10;
import java.util.Scanner;
public class EXERCISES_02_10 {
    public static void main(String[] args) {
        System.out.println("---Science: calculating energy---");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms : ");
        float m=input.nextFloat();
        System.out.print("Enter the intial temperature : ");
        float intialTemperature=input.nextFloat();
        System.out.print("Enter the final temperature : ");
        float finalTemperature=input.nextFloat();
        //compute energy
        float energy=m*(finalTemperature-intialTemperature)*4184;
        //display results
        System.out.print("The energy needed is "+energy);
    }
    
}
