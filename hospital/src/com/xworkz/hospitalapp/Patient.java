package com.xworkz.hospitalapp;

public class Patient {

             int patientId;
             String name;
             int age;

             long phoneNumber;

             boolean isPatientAdded;

             String bloodGroup;

             String attenderName;


             Patient(int patientId,String name,int age,long phoneNumber,boolean isPatientAdded,String bloodGroup,String attenderName) {

                 this.patientId = patientId;
                 this.name = name;
                 this.age = age;
                 this.phoneNumber = phoneNumber;
                 this.isPatientAdded = isPatientAdded;
                 this.bloodGroup = bloodGroup;
                 this.attenderName = attenderName;

             }

}

