package com.xworkz.teashopapp;

public class TeaShop {

    static String teaNames[] = {null,null,null,null};
    static int index;

    public static boolean addTeaName(String teaName){

        System.out.println("calling addTeaName");

        boolean isAdded = false;

        if(teaName!= null && index<teaNames.length){

            teaNames[index++]= teaName;

            isAdded = true;

        }else{

            System.out.println("max size is exceeds");
        }

        return isAdded;

    }

    public static void getTeaNames(){

        for(int i=0;i<teaNames.length;i++){

            System.out.println(teaNames[i]);


        }

    }

    public static boolean UpdateTeaName(String oldName,String newName){

        boolean isUpdated = false;

        for(int i = 0;i<teaNames.length;i++){
            // String is class defined already in java
            if(teaNames[i].equals(oldName)){
                // particular value present in the index
                teaNames[i] = newName;
                isUpdated = true;
            }

        }
        return isUpdated;
    }

    public static String getTeaName(String teaName){               //syntax nd semantics - java fundamentals

        for(int i=0;i<teaNames.length;i++){

            if(teaNames[i].equals(teaName)){

                System.out.println("tea name is found");

                return teaNames[i];
            }
        }

        return "no tea name found";

    }







}
