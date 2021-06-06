
package exercises_01_02;
import java.util.Scanner; 
public class EXERCISES_01_02 {
    public static void main(String[] args) {
        System.out.println("---Display five messagas---");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number = ");
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("Welcom to Java");
        }
    }
}
