package com.xworkz.hospitalapp.patient.exception;

public class DiseaseNotFoundException extends RuntimeException{

    public DiseaseNotFoundException(String disease){
        System.out.println("enter the correct diseaseName:" + disease);
    }
}
