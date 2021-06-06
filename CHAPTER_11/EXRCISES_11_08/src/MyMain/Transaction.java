/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMain;


import java.util.Date;
/**
 *
 * @author Windows
 */
public class Transaction {
    
    Date date;
    char type;
    double amount;
    double balance;
    String description;
    
    public Transaction(char type, double amount, double balance, String description )
    {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = new Date();
    }
    
    public Transaction(char type, double amount, double balance)
    {
        this(type,amount,balance,"");
    }
    
    public Date getDate()
    {
        return this.date;
    }
    
    public char getType()
    {
        return this.type;
        
    }
    
    public double getAmount()
    {
        return this.amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
