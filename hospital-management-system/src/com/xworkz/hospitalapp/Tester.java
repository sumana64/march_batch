package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Document;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("enter the size:");

         int size = sc.nextInt();

         Hospital hos = new ApolloHospitalImpl(size);

         for (int patientIndex = 0;patientIndex<size;patientIndex++) {

              Patient pat = new Patient();
              System.out.println("enter the patient name:");
              pat.setPatientName(sc.next());
              System.out.println("enter the patient id:");
              pat.setPatientId(sc.nextInt());
              System.out.println("enter the patient phoneNo");
              pat.setPhoneNo(sc.nextLong());
              System.out.println("enter the patient location");
              pat.setLocation(sc.next());
              System.out.println("enter the patient gender");
              pat.setGender(Gender.valueOf(sc.next()));
              System.out.println("enter the epatient wardNo");
              pat.setWardNo(sc.next());
              System.out.println("enter the attender:");
              pat.setAttender(sc.next());
              System.out.println("enter the document:");
              pat.setDocument(Document.valueOf(sc.next()));
              System.out.println("enter the bloodGroup");
              pat.setBloodGroup(sc.next());
              System.out.println("enter the diseasename:");
              pat.setDiseaseName(sc.next());

              hos.addPatient(pat);

         }


         hos.getAllPatient();

         System.out.println("enter the location:");

         Patient pat = hos.getPatientByAddress(sc.next());

         System.out.println(pat);

         System.out.println("enter the wardNo");

         String str = hos.getPatientNameByWardNo(sc.next());

         System.out.println(str);

         System.out.println("enter the existingPatientName:");

         String a = sc.next();

         System.out.println("enter the updated diseasename:");

         String b = sc.next();

         boolean str1 = hos.updatePatientDiseaseByPatientName(a,b);

         System.out.println(str1);

         hos.getAllPatient();

         System.out.println("enter the existingid: ");

         int n1 = sc.nextInt();

         System.out.println("enter the wardno:");

         String n2 = sc.next();

         boolean str2 = hos.updatePatientWardNoByPatientId(n1,n2);

         hos.getAllPatient();

         System.out.println("enter the diseaseName: ");

         String[] s1 = hos.getPatientNameByDiseaseName(sc.next());

         System.out.println(s1);




    }



}
