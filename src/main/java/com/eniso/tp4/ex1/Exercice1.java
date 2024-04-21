/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;
/**
 *
 * @author Hatto
 */
public class Exercice1 {

public static void main(String[] args) {
SavingsAccouunt account = new SavingsAccouunt (101, 5.0, 3.0);
SavingsAccouunt savingsAccount = (SavingsAccouunt) account;
System.out.println("Conversion explicite réussie: " + (savingsAccount != null));
ChekingAccount anotherAccount = new ChekingAccount (102, 500.0, 200.0);
ChekingAccount checkingAccount = (ChekingAccount) anotherAccount;
System.out.println("Conversion explicite réussie: " + (checkingAccount != null));
// Test de fonctionnalité existante
SavingsAccouunt savingsAccount1 = new SavingsAccouunt (101, 5.0, 3.5);
savingsAccount1. deposit (1000.0);
savingsAccount1.withdraw (200.0);
System.out.println("Solde du compte épargne : + savingsAccount1.getBalance ()");
ChekingAccount checkingAccount1 = new ChekingAccount (102, 500.0, 200.0);
checkingAccount1. deposit (1500.0);
checkingAccount1.withdraw (800.0);
System.out.println("Solde du compte chèque : + checkingAccount1.getBalance()");
Customer customer = new Customer ("John", "Doe");
customer.addAccount (savingsAccount1);
customer.addAccount (checkingAccount1);
System.out.println("Solde total du client : " + customer.getTotalAccountBalance () );
Bank bank= new Bank();
bank.addCustomer (customer);
System.out.println("Solde total de la banque :" +bank.getTotalBalance () );
}
}
