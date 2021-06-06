
package exercises_01_11;
import java.util.Scanner;
public class EXERCISES_01_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("---Population projection---");
        int time=60*60*24*365;
        System.out.print("Enter year : ");
        int year=input.nextInt();
        System.out.print("Enter population : ");
        int population=input.nextInt();
        System.out.println("Population in 1 year = "+population);
        for(int i=2;i<=year;i++){
            int birth=time/7;
            int death=time/13;
            int immigrant=time/45;
            population = birth-death+immigrant+population;
            System.out.println("Population in "+i+" year = "+population);       
      }  
   }
}
