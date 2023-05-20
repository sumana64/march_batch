package com.xworkz.hospitalapp;

import java.util.Scanner;

public class PatientTester1 {

         public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("enter the patientId:");

                int id = sc.nextInt();

                System.out.println("enter the patientNama:");

                String name = sc.next();

                System.out.println("enter the age");

                int age = sc.nextInt();

                System.out.println("enter the phonenumber:");

                long number = sc.nextLong();

                System.out.println("enter the isPatientAdded:");

                boolean added = sc.nextBoolean();

                System.out.println("enter the bloodgroup:");

                String blood = sc.next();

                System.out.println("enter the attenderName");

                String attender = sc.next();

                Patient1 patient = new Patient1();

                patient.setPatientId(id);

                patient.setPatientName(name);

                patient.setAge(age);

                patient.setPhoneNumber(number);

                patient.setBloodgroup(blood);

                patient.setAttenderName(attender);

                patient.setIsPatientAdded(added);

                System.out.println(patient.getPatientId() + " " + patient.getPatientName() + " " + patient.getAge() + " " + patient.getPhoneNumber() + " " + patient.getIsPatientAdded() + " " + patient.getBloodgroup() + " " + patient.getAttenderName());




    }


}
