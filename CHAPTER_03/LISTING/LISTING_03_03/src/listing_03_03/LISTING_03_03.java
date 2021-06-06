import java.util.Scanner;
public class LISTING_03_03 {
    public static void main(String[] args) {
        //1.Generate two random single-digit integers
        int number1 =(int)(Math.random()*10);
        int number2 =(int)(Math.random()*10);
        
        //2.if number1<number2,swap number1 with number2
        if(number1<number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        //3.prompt the student to answer "what is number1-number2?"
        System.out.println("what is "+number1+" - "+number2+" ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        //4.grada the Answer and display the result
        if(number1-number2 == answer){
            System.out.println("you are correct!");
        }
        
        else {
            System.out.println("you answer is wrong.");
            System.out.println(number1+" - "+number2+" should be "+(number1-number2));
            
        }
            
    }
    
}
