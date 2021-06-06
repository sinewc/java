
package exercises_02_04;
import java.util.Scanner;
public class EXERCISES_02_04 {
    public static void main(String[] args) {
        System.out.println("---Convert pounds into kilograms---");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enet a number in pounds : ");
        float pounds =input.nextFloat();
        
        //Compute kilograms
        float kilograms = (float)(pounds*0.454);
        
        //Display results
        System.out.print(pounds+" pounds is "+kilograms+" kilogramt");
    }
    
}
