package com.xworkz.bank1app;

public class BankAccount {

            private double balance;

            public void credit(double amount){

                this.balance = balance + amount;
            }

            public void debit(double amount){

                balance = balance-amount;
            }
            public double getBalance(){

                return balance;
            }

            public void transfer(BankAccount beneficiaryAccount,double amount){

                this.debit(amount);

                beneficiaryAccount.credit(amount);




            }




}
