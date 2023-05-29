package com.xworkz.relationshiopapp.bank;

public class BankTester {

    public static void main(String[] args) {

        Branch br = new Branch();

        Bank bank = new Bank(br);

        bank.branch.account();



    }




}
