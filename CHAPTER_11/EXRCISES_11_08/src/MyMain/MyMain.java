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

import java.util.ArrayList;

public class MyMain {

    public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(200);

        acc.withdraw(50);
        acc.withdraw(500);
        acc.withdraw(100);
        
        printTrans(acc.getTrans());
        
        

    }
    
    public static void printTrans(ArrayList<Transaction> t)
    {
        System.out.println("===TRANSACTIONS===");
        for(int i = 0 ; i < t.size(); i ++)
        {
            System.out.println(t.get(i).getType() + "\t"+ t.get(i).getAmount() + "\t" + t.get(i).getBalance() + "\t" + t.get(i).getDate() );
        }
    }

}
