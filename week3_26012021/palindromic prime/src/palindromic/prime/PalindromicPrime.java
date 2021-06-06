
package palindromic.prime;
public class PalindromicPrime {
    public static void main(String[] args) {
    final int TOTLE = 100; 
    final int LINE = 10;
    int count =1;
    int number =2;
    while(count <=TOTLE){
        if(isPrime(number)&&isPalindromic(number)){
            System.out.print(number+" ");
            if(count%LINE==0){
                System.out.println();//check 10 number per line
            }
            count++;
        }
        number++;
        }
    }
    //find prime
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }
        for(int divisor=2;divisor<=num/2;divisor++){
            if(num%divisor==0){
                return false;
             }
        }
        return true;
    }
    //rever number such as 123 to 321 
    //check palindrom
     public static int reverse(int num){
        int test =0;
        while(num !=0){
          int digit=num%10;
          test=test*10+digit;
          num=num/10;
         }
        return test;
    }
     //check input num = palindrom
     public static boolean isPalindromic(int num){
         return num==reverse(num);
     } 
     
}

    
    
 
