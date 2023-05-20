package com.xworkz.hospitalapp;

import java.util.Scanner;

public class PatientTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the id:");

        int id = sc.nextInt();

        System.out.println("enter the name:");

        String name = sc.next();

        System.out.println("enter the age:");

        int age = sc.nextInt();

        System.out.println("enter the phoneNumber:");

        long number = sc.nextLong();

        System.out.println("iaPatientAdded :");

        boolean added = sc.nextBoolean();

        System.out.println("enter the bloodgroup:");

        String blood = sc.next();

        System.out.println("enter the attenderName:");

        String attender = sc.next();

        Patient patient = new Patient(id,name,age,number,added,blood,attender);

        System.out.println(patient.patientId + " " + patient.name + " " + patient.age + " " + patient.phoneNumber + " " + patient.isPatientAdded + " " + patient.bloodGroup + " " + patient.attenderName);


    }





}
