/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

import java.util.ArrayList;
public class Bank {
private ArrayList<Customer> customers;
// Constructeur
public Bank() {
this.customers = new ArrayList<>();
}
// Méthode pour ajouter un client à la banque
public void addCustomer (Customer customer) {
customers.add(customer);
}
// Méthode pour supprimer un client de la banque
public void removeCustomer (Customer customer) {
customers.remove (customer);
}
// Méthode pour obtenir le solde total de tous les comptes de la banque
public double getTotalBalance () {
double totalBalance = 0.0;
   for (Customer customer : customers) {

totalBalance += customer.getTotalAccountBalance ();}
return totalBalance;
    }
}
