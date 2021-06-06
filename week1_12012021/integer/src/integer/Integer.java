
package integer;
import java.util.Scanner;
public class Integer {
    
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();

        if (i > 0 && i < 1000) {
            while (i > 0) {
                int temp = i % 10;
                sum += temp;
                i = i / 10;

            }
            System.out.print("Digits sum: "+sum);

        }
        else{
           System.out.print("error");
        }
    }

}