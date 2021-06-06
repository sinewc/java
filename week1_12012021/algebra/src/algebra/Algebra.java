
package algebra;
import java.util.Scanner;
public class Algebra {
    public static void main(String[] args) {
        double a, b ,c ,d ,e,f,x,y;
        System.out.print("Enter weight in pounds: a = ");
        Scanner input1 = new Scanner(System.in);
        a = input1.nextDouble();
        System.out.print("Enter weight in pounds: b = ");
        b = input1.nextDouble();
        System.out.print("Enter weight in pounds: c = ");
        c = input1.nextDouble();
        System.out.print("Enter weight in pounds: d = ");
        d = input1.nextDouble();
        System.out.print("Enter weight in pounds: e = ");
        e = input1.nextDouble();
        System.out.print("Enter weight in pounds: f =");
        f = input1.nextDouble();
    
     x = (e*d - b*f )/(a*d - b*c);
     y = (a*f - e*c )/(a*d - b*c);
     System.out.println(x);
     System.out.println(y);
     
    }
    
}
