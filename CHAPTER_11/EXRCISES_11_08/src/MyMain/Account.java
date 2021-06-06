/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMain;

/**
 *
 * @author Windows
 */
import java.util.Date;
import java.util.ArrayList;
public class Account {
	// Data fields
	private int id;
	public double balance;
	private static double annualInterestRate;
	private Date dateCreated;
        ArrayList<Transaction> trans;
        
        

	// Constructors
	/** Creates a default account */
	Account() {
		this(0, 0); 
	}

	/** Creates an account with the specified id and initial balance */
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
                trans = new ArrayList<Transaction>();
	}

	// Mutator methods
	/** Set id */
	public void setId(int id) {
		this.id = id;
	}

	/** Set balance */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** Set annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Accessor methods
	/** Return id */
	public int getId() {
		return id;
	}

	/** Return balance */
	public double getBalance() {
		return this.balance;
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Return dateCreated */
	public String getDateCreated() {
		return dateCreated.toString();
	}

	/** Return monthly interest rate */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	/** Return monthly interest */
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	/** Decrease balance by amount */
	public void withdraw(double amount) {
	if(this.balance - amount < 0 )
        {
            return;
        }
            balance -= amount;
                trans.add(new Transaction('W',amount,this.balance,"-withdraw-"));
	}

	/** Increase balance by amount */
	public void deposit(double amount) {
		balance += amount;
                trans.add(new Transaction('D',amount,this.balance,"-deposite-"));
	}

	/** Return a String decription of Account class */
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
        
        public ArrayList<Transaction> getTrans()
        {
            return this.trans;
        }
    
}
