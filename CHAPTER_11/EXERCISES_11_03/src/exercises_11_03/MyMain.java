
package exercises_11_03;
public class MyMain {
    public static void main(String[] args){
 
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount saving = new SavingsAccount();
        
        System.out.println( checking.getBalance());
        
        checking.setOverdraftLimit(20);
        checking.setAnnualInterestRate(0);
        checking.deposit(200);
        checking.withdraw(600);
        
        //////////
        
        saving.deposit(200);
        saving.withdraw(100);
        
        
        System.out.println(saving.toString());
		
	}
    }

