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
public class OopBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cuenta primaria del cliente
        
        Account primAccount = new Account();
        primAccount.deposit(9000.0);
        
        // Cuenta secundaria del cliente
        
        Account secAccount = new Account();
        secAccount.deposit(5000.0);
        
        // Se transfiere $$ a su cuenta Saldazo desde USA (O sea la secAccount)
        
        primAccount.accountTransfer(500, secAccount);
        
        // Verificar Transfererencia de $$
        System.out.print("Customer, your account currently has a balance of  ");
        System.out.println(primAccount.getBalance());
        
        System.out.print("Bienvenido a tu cuenta Saldazo, tu saldo a la fecha es de  ");
        System.out.println(secAccount.getBalance());
    }
    
}
