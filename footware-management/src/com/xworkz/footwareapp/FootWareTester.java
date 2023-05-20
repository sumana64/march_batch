package com.xworkz.footwareapp;

import java.util.Scanner;

public class FootWareTester {

    public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.println("enter the id:");

             int id = sc.nextInt();

        System.out.println("enter the brandName:");

            String brand = sc.next();

        System.out.println("enter the size:");

            int size = sc.nextInt();

        System.out.println("enter the type:");

              String type = sc.next();

        System.out.println("enter the price:");

              int price = sc.nextInt();

        System.out.println("enter the materialType:");

              String material = sc.next();

              FootWare foot = new FootWare();

              foot.setFootWareId(id);

              foot.setBrandName(brand);

              foot.setSize(size);

              foot.setType(type);

              foot.setPrice(price);

              foot.setMaterialType(material);

        System.out.println(foot.getFootWareId() + " " + foot.getBrandName() + " " + foot.getType() + " " + foot.getSize() + " " + foot.getPrice() + " " + foot.getMaterialType());
















    }



}
