
package exercises_01_13;
import java.util.Scanner;
public class EXERCISES_01_13 {
    public static void main(String[] args) {
        System.out.println("---Algebra:solve 2*2 linear equations---");
        Scanner input=new Scanner(System.in);
        System.out.print("a : ");
        double a=input.nextDouble();
        System.out.print("b : ");
        double b=input.nextDouble();
        System.out.print("c : ");
        double c=input.nextDouble();
        System.out.print("d : ");
        double d=input.nextDouble();
        System.out.print("e : ");
        double e=input.nextDouble();
        System.out.print("f : ");
        double f=input.nextDouble();
        
        //calculation
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x = "+x);
        System.out.print("y = "+y);
    }
    
}
