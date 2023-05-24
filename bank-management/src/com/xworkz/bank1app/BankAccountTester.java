package com.xworkz.bank1app;

import java.util.Scanner;

public class BankAccountTester {

            public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                BankAccount bank = new BankAccount();

                System.out.println("the current balance is:" + bank.getBalance());

                System.out.println("enter the amount:");

                double amount = sc.nextDouble();

                bank.credit(amount);

                double balance = bank.getBalance();

                System.out.println("the balance after the credit:" + bank.getBalance());



                System.out.println("enter the amount to be debit:");

                double debit = sc.nextDouble();

                bank.debit(debit);

                System.out.println("the current balance after the debit:" + bank.getBalance());


                BankAccount friendsAccount = new BankAccount();

                System.out.println("enter the amount:");

                double cred1 = sc.nextDouble();

                friendsAccount.credit(cred1);

                System.out.println("the friendsaccount balance is:" + friendsAccount.getBalance());


                System.out.println("the amount to transfer:");

                double transfer = sc.nextDouble();

                bank.transfer(friendsAccount,transfer);

                System.out.println("my account balance is:" + bank.getBalance());

                System.out.println("friendsAccount balance is:" + friendsAccount.getBalance());



            }








}
