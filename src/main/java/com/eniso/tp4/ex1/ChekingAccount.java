/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author Hatto
 */ 
public class ChekingAccount extends BankAccount {
private Double overdraftAllowed;
public ChekingAccount (Integer accountNumber, Double balance, Double overdraftAllowed) {
super (accountNumber, balance);

this.overdraftAllowed = overdraftAllowed;
}
public void setoverdraftAllowed (Double overdraftAllowed) { 
this.overdraftAllowed = overdraftAllowed;
}
public Double getoverdraftAllowed () {

return overdraftAllowed;
}
@Override
public void withdraw (double amount) {
if (balance >= amount || (balance + overdraftAllowed) >= amount) {
balance -= amount;
} else {
System.out.println("Fonds insuffisants. Opération de retrait annulée.");
}
}
}
