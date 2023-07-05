package com.xworkz.ecommerceapp.exception;

public class PasswordNotFoundException extends RuntimeException{

    public PasswordNotFoundException(String password){

        System.out.println("enter the correct password " + password);
    }
}
