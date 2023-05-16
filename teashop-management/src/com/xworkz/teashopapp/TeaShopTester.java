package com.xworkz.teashopapp;

public class TeaShopTester {

    public static void main(String args[]){


        //TeaShop.getTeaNames();

        TeaShop.addTeaName("black tea");
        TeaShop.addTeaName("ginger tea");
        TeaShop.addTeaName("black tea");
        TeaShop.addTeaName("masala tea");
        TeaShop.addTeaName("green tea");
        TeaShop.addTeaName("white tea");

        TeaShop.getTeaNames();

        String tea = TeaShop.getTeaName("green tea");

        System.out.println(tea);

        boolean ref = TeaShop.UpdateTeaName("masala tea","green tea");

        System.out.println("the updatedteaname is" + ref);

        TeaShop.getTeaNames();




    }




}
