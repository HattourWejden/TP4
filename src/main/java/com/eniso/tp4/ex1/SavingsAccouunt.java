/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

public class SavingsAccouunt extends BankAccount {

private Double interestRate;

public SavingsAccouunt (Integer accountNumber, Double balance, Double interestRate) {
super (accountNumber, balance);
this.interestRate = interestRate;
}

public void calculateInterest () {

double interest = balance * interestRate / 100;
deposit (interest);
}

public Double getInterestRate() {
return interestRate;

}

@Override
public void withdraw (double amount) {
if (amount <= balance) {
balance-=amount;

} else {

System.out.println("Retrait excessif. Une pénalité sera appliquée.");
double penalty=amount * 0.05;
balance -=(amount + penalty);
       }
}
}