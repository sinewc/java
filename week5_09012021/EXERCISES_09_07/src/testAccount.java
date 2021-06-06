import java.util.Scanner;
public class testAccount {
    public static void main(String[] args) {
        int id=0,withdraw=0;
        double balance=0,annualInterestRate=0,deposit=0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.print("Enter Account ID : " );
                      id = input.nextInt();
		System.out.print("Enter Balance : " );
                      balance = input.nextDouble();
		System.out.print("Enter Annual Interest Rate : ");
                      annualInterestRate = input.nextDouble();
                System.out.print("Enter withdraw : ");
                      withdraw = input.nextInt();
                System.out.print("Enter deposit : ");
                      deposit = input.nextDouble();
                System.out.println("------------------------------------------");
        
		// Create an Account object with an account
		// ID of 1122, and a balance of $20,000
		Account account = new Account(id, balance);
                if(withdraw>account.getBalance1()){
                   System.out.println(" The amount you wish to withdraw is greater than the amount in your account, please try again.");
                   System.out.print("Enter withdraw : ");
                      withdraw = input.nextInt();    
                }

		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(annualInterestRate);

		// Withdraw $2,500
		account.withdraw(withdraw);

		// Deposit $3,000
		account.deposit(deposit);

		// Display the balance, the monthly interest, 
		// and the date when this account was created
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
                System.out.println("Account ID: " + account.getId());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
                System.out.println("Date created: " + account.getDateCreated());
                System.out.println("------------------------------------------");
                
	}
}
