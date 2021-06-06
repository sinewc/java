
package exercises_02_11;
import java.util.Scanner;
public class EXERCISES_02_11 {
    public static void main(String[] args) {
        System.out.println("---Populion projection--- ");
        Scanner input=new Scanner(System.in);
         
       System.out.print("Enter the number of year : ");
       long year=input.nextLong();
       
       long population = 312032486;
       long time = year*365*24*60*60;
       long birth = time/7;
       long death = time/13;
       long immigrant = time/45;
       
       System.out.print("The population in "+year+" is "+(population+birth+immigrant-death));
        
    }
}
