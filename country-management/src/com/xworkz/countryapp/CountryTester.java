package com.xworkz.countryapp;

import java.util.Scanner;

public class CountryTester {

              public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

               System.out.println("enter the id:");

               int id = sc.nextInt();

               System.out.println("enter the code:");

               String code = sc.next();

               System.out.println("enter the name: ");

               String name = sc.next();

               System.out.println("enter the noOfStates:");

               String states = sc.next();

               System.out.println("enter the population:");

               double population = sc.nextDouble();

               System.out.println("enter the currency:");

               String currency = sc.next();

               System.out.println("enter the capital:");

               String capital = sc.next();

               System.out.println("enter the economy:");

               String economy = sc.next();

               Country ct = new Country();

               System.out.println(ct.countryId + " " +ct.countryCode + " " + ct.countryName + " " + ct.noOfStates + " " + ct.population + " " + ct.currency + " " + ct.capital + " " +ct.economy);




















              }









}
