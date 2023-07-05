package com.xworkz.hospitalapp.patient.exception;

public class WardNotFoundException extends RuntimeException{


          public WardNotFoundException(String wardNo){

              System.out.println("enter the correct wardNo : " + wardNo);

          }








}
