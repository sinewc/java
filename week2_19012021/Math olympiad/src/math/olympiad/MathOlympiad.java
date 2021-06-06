
package math.olympiad;
import java.util.Scanner;
public class MathOlympiad {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter order ");
       int order = input.nextInt();
       int n1=1,neven=1,nodd=0;
       for(int n=1;n<=order;n++){
                if(n%2==1){
                    neven=neven+n-1;
                    System.out.print(neven);
                }
                if(n%2==0){
                    nodd=nodd+3;
                System.out.print(nodd);
                }
        System.out.println();
       }
    }
}
