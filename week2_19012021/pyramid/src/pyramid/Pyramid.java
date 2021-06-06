
package pyramid;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            // Prompt the user to enter an integer from 1 to 15
	    System.out.print("Enter the number of lines: ");
	    int numberOfLines = input.nextInt();

		// pyramid
		for (int rows = 1; rows <= numberOfLines; rows++) {
			
			for (int f = numberOfLines - rows; f >= 1; f--) {
				System.out.print("  ");
			}
			
			for (int m = rows; m >= 2; m--) {
				System.out.print(m + " ");
			}
			
			for (int b = 1; b <= rows; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
