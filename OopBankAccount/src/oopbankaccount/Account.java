/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbankaccount;

/**
 *
 * @author Abner Reyes
 */
public class Account {
    
    
    private String accountNumber;
    private double balance;
    
    public void deposit (double amount){
        balance = balance + amount;
    }
    
    public void withdraw (double amount){
        if (amount <= balance){
            
        }else {
            
            System.err.println("Lack of funds");
        }
        
    }
    
    public double getBalance(){
        return balance;
        
    }
    
    public void accountTransfer(double amount,Account secAccount){
        secAccount.deposit(amount);
        balance = balance - amount;
        
    }
}
