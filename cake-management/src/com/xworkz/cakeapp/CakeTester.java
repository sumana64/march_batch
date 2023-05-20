package com.xworkz.cakeapp;

import java.util.Scanner;

public class CakeTester {

                public static void main(String[] args) {

                     Scanner sc = new Scanner(System.in);

                    System.out.println("enter the cakeId:");

                    int id = sc.nextInt();

                    System.out.println("enter the color: ");

                    String color = sc.next();

                    System.out.println("enter theshape: ");

                    String shape = sc.next();

                    System.out.println("enter the flavour:");

                    String flavour = sc.next();

                    System.out.println("enter the price:");

                    double price = sc.nextDouble();

                    Cake cake = new Cake();

                    cake.setCakeId(id);
                    cake.setColor(color);
                    cake.setShape(shape);
                    cake.setFlavour(flavour);
                    cake.setPrice(price);

                    System.out.println();



                }




}
