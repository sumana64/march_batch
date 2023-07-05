package com.xworkz.hospitalapp.patient.exception;

public class PatientNameFoundException extends RuntimeException{

    public PatientNameFoundException(String name){

        System.out.println("enter the correct he patient name:" + name);
    }

}
