package com.xworkz.hospitalapp.patient.exception;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.Scanner;

public class MainTester {

    public static void main(String[] args) {

        String s1 = null;
        String s2 = "null";

        System.out.println("main starts");

        try {
            System.out.println(s1.equals(s2));
        }catch(NullPointerException e){
            e.printStackTrace();
        }


        System.out.println("main ends");


        System.out.println("numberformat starts");

        try {
            String no = "45678T";
            Integer no2 = Integer.parseInt(no);
            System.out.println(no2);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("numberformat ends");2
2


        System.out.println("array starts");

        try
        {String name[] = new String[3];
        int index = 0;

        name[0] = "gnhbjn";
        name[1] = "jmknhj";
        name[2] = "mkoil";
        name[3] = "bnfhjn";
        name[4] = "olkiuj";

            for (String nm : name) {
                System.out.println(nm);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("array ends");




        System.out.println("mismatch starts");

        int id;

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the id:");

            int id1 = sc.nextInt();

            System.out.println("the id is:" + id1);

        }catch(Exception e){

            e.printStackTrace();
        }

            System.out.println("mismatch ends");


        System.out.println("arithmetic starts");

        try {
            int a = 100 / 0;

            System.out.println(a);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("arithmetic ends");







        }





    }







