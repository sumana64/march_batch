package com.xworkz.bank1app;

import java.util.Scanner;

public class SavingsAccountTester {

            public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                SavingsAccount save = new SavingsAccount();

                System.out.println("the curent balance is:" + save.getBalance());

                System.out.println("enter the amount to credit:");

                double cred = sc.nextDouble();

                save.credit(cred);

                System.out.println("the balance after the credit:" + save.getBalance());


                System.out.println("enter the amount to debit:");

                double debit =sc.nextDouble();

                save.debit(debit);

                System.out.println("the amount after the debit:" + save.getBalance());



                SavingsAccount friendAccount1 = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred1 = sc.nextDouble();

                friendAccount1.credit(cred1);

                System.out.println("enter the amount to transfer: ");

                double transfer1 = sc.nextDouble();

                save.transfer(friendAccount1,transfer1);

                System.out.println("the my account balance is:" +save.getBalance());

                System.out.println("the friendAccount1 balance is: " + friendAccount1.getBalance());


                SavingsAccount friendAccount2 = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred2 = sc.nextDouble();

                friendAccount2.credit(cred2);

                System.out.println("enter the amount to transfer: ");

                double transfer2 = sc.nextDouble();

                save.transfer(friendAccount2,transfer2);

                System.out.println("the my account balance is:" +save.getBalance());

                System.out.println("the friendAccount1 balance is: " + friendAccount2.getBalance());



                SavingsAccount friendAccount3 = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred3 = sc.nextDouble();

                friendAccount3.credit(cred3);

                System.out.println("enter the amount to transfer: ");

                double transfer3 =sc.nextDouble();

                save.transfer(friendAccount3,transfer3);

                System.out.println("the my account balance is:" + save.getBalance());

                System.out.println("the friendAccount1 balance is: "+ friendAccount3.getBalance());



                SavingsAccount friendAccount4  = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred4 = sc.nextDouble();

                friendAccount4.credit(cred4);

                System.out.println("enter the amount to transfer: ");

                double transfer4 =sc.nextDouble();

                save.transfer(friendAccount4,transfer4);

                System.out.println("the my account balance is:" + save.getBalance());

                System.out.println("the friendAccount1 balance is: "+ friendAccount4.getBalance());



                SavingsAccount friendAccount5 = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred5 = sc.nextDouble();

                friendAccount5.credit(cred5);

                System.out.println("enter the amount to transfer: ");

                double transfer5 = sc.nextDouble();

                save.transfer(friendAccount5,transfer5);

                System.out.println("the my account balance is:" +save.getBalance());

                System.out.println("the friendAccount1 balance is: "+ friendAccount5.getBalance());


                SavingsAccount friendAccount6 = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred6 = sc.nextDouble();

                friendAccount6.credit(cred6);

                System.out.println("enter the amount to transfer: ");

                double transfer6 = sc.nextDouble();

                save.transfer(friendAccount6,transfer6);

                System.out.println("the my account balance is:" + save.getBalance());

                System.out.println("the friendAccount1 balance is: " + friendAccount6.getBalance());



                SavingsAccount friendAccount7 = new SavingsAccount();

                System.out.println("enter the amount:");

                double cred7 = sc.nextDouble();

                friendAccount7.credit(cred7);

                System.out.println("enter the amount to transfer: ");

                double transfer7 = sc.nextDouble();

                save.transfer(friendAccount7,transfer7);

                System.out.println("the my account balance is:" +  save.getBalance());

                System.out.println("the friendAccount1 balance is: " +friendAccount7.getBalance());
















              }
}
