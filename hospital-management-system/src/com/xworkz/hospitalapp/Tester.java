package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Document;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class Tester {

    public static void main(String[] args) {

         Hospital hos = new ApolloHospitalImpl();

         Patient pat = new Patient();
         pat.setPatientName("ramesh");
         pat.setAge(59);
         pat.setDocument(Document.Aadharcard);
         pat.setGender(Gender.male);
         pat.setBloodGroup("AB");
         pat.setPhoneNo(786684087L);

         Patient pat1 = new Patient();
         pat1.setPatientName("savitha");
         pat1.setAge(34);
         pat1.setDocument(Document.pancard);
         pat1.setGender(Gender.female);
         pat1.setBloodGroup("B");
         pat1.setPhoneNo(7838696969L);

         hos.addPatient(pat);
         hos.addPatient(pat1);

         hos.getAllPatient();





    }



}
