package com.xworkz.bankapp;

import java.util.Scanner;

public class BankTester {

              public static void main(String[] args) {

                  Scanner sc = new Scanner(System.in);

                  System.out.println("enter the id: ");

                  int id = sc.nextInt();

                  System.out.println("enter the accountNo");

                  String accNo = sc.next();

                  System.out.println("enter the branchNo:");

                  int branchNo = sc.nextInt();

                  System.out.println("enter the accountType:");

                  String accType = sc.next();

                  System.out.println("enter the ifscCode:");

                  String ifsc = sc.next();

                  System.out.println("enter the location:");

                  String loc = sc.next();

                  Bank bk = new Bank();

                  bk.setId(id);

                  bk.setAccountNo(accNo);

                  bk.setAccountType(accType);

                  bk.setLocation(loc);

                  bk.setBranchNo(branchNo);

                  bk.setIfscCode(ifsc);

                  System.out.println(bk.id + " " + bk.accountNo + " " + bk.branchNo + " " + bk.accountType + " " + bk.ifscCode + " " + bk.location);












              }

}
