package com.xworkz.hospitalapp.patient.exception;

public class AddressNotFoundException extends RuntimeException{

    public AddressNotFoundException(String address){

        System.out.println("Enter the correct address :" + address);
    }



}
