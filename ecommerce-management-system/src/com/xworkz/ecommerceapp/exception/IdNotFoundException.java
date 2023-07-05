package com.xworkz.ecommerceapp.exception;

public class IdNotFoundException extends RuntimeException{

    public IdNotFoundException(int id){

        System.out.println("enter the correct id:" + id);

    }
}
