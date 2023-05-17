package com.xworkz.orionmallapp;

import java.util.Scanner;

public class OrionMallTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OrionMall orion = new OrionMall();

        for(int i=0;i<orion.shops.length;i++) {

            System.out.println("enter the shop:");

            String shop = sc.next();

            orion.addShops(shop);

        }

             orion.getShops();



    }










}
