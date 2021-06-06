
package exercises_01_04;
import java.util.Scanner;
public class EXERCISES_01_04 {
    public static void main(String[] args) {
        System.out.println("---Print a table---");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        System.out.println("a     a^2      a^3");
        for(int i=1;i<=num;i++){
            int powertwo=i*i;
            int powerthree=i*i*i;
            System.out.println(i+"      "+powertwo+"        "+powerthree);
        }
    }
    
}
