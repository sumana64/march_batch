package com.xworkz.mobileshop;

import java.util.Scanner;

public class MobileShopTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         MobileShop shop = new MobileShop();

         for(int i=0;i<shop.mobiles.length;i++){

             System.out.println("enter the mobile:");

             String mobile = sc.next();

             shop.addMobiles(mobile);

         }

             shop.getMobiles();



    }







}
