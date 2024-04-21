/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author Hatto
 */
public class BankAccount {
protected Integer accountNumber;
protected Double balance;

public BankAccount (Integer accountNumber, Double balance) {
this.accountNumber = accountNumber;
this.balance = balance;
}
public void deposit (double amount) {
balance += amount;
}
public void withdraw (double amount) {
if (amount <= balance) {
balance -= amount;
} else {
System.out.println("Solde insuffisant.");
}
}

public Double getBalance () {
return balance;
}
}