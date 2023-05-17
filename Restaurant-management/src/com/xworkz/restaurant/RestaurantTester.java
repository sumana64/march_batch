package com.xworkz.restaurant;

import java.util.Scanner;

public class RestaurantTester {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          Restaurant rt = new Restaurant();

          for(int i=0;i<rt.food.length;i++){

              System.out.println("enter the menu:");

              String menu = sc.next();

              rt.addMenu(menu);

          }

               rt.getMenus();

        System.out.println("enter the old food:");

        String old = sc.next();

        System.out.println("enter the new food");

        String newFood = sc.next();


               rt.update(old,newFood);

               rt.getMenus();

        System.out.println("enter the menu:");

        String mn = sc.next();

        String ref = rt.getMenu(mn);

        System.out.println(ref);





    }











}
