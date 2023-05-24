package com.xworkz.bank1app;

import java.util.Scanner;

public class CurrentAccountTester {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in) ;

       CurrentAccount cr = new CurrentAccount();

        System.out.println("the balance is:" + cr.getBalance());

        System.out.println("enter the amount to credit:");

        double cred = sc.nextDouble();

        cr.credit(cred);

        double balance = cr.getBalance();

        System.out.println("the current balance is:" + balance);


        System.out.println("enter the amount to debit:");

        double debit = sc.nextDouble();

        cr.debit(debit);

        double balance1 = cr.getBalance();

        System.out.println("the current balance after the debit:" + balance1);







    }



}
