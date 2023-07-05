package com.xworkz.ecommerceapp.exception;

public class NameNotFoundException extends RuntimeException{

    public NameNotFoundException(String name){

        System.out.println("enter the correct name:" + name);
    }
}
