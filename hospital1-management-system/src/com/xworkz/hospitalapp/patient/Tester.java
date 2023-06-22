package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.patient.constant.Gender;
import com.xworkz.hospitalapp.patient.hospital.Hospital;
import com.xworkz.hospitalapp.patient.hospital.ManipalImpl;
import com.xworkz.hospitalapp.patient.patient.Patient;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size:");

        int size = sc.nextInt();

        Hospital hos = new ManipalImpl(size);

        for (int patientIndex = 0; patientIndex < size; patientIndex++) {

            Patient patient = new Patient();
            System.out.println("enter the id:");
            patient.setPatientId(sc.nextInt());
            System.out.println("enter the patientName:");
            patient.setPatientName(sc.next());
            System.out.println("enter the address:");
            patient.setAddress(sc.next());
            System.out.println("enter the phoneno:");
            patient.setPhoneNo(sc.nextLong());
            System.out.println("enter the wardNo");
            patient.setWardNo(sc.next());
            System.out.println("enter the attender:");
            patient.setAttender(sc.next());
            System.out.println("enter the gender:");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("enter the diseaseName:");
            patient.setDiseaseName(sc.next());
            System.out.println("enter the patientage:");
            patient.setAge(sc.nextInt());

            hos.createPatient(patient);


        }

        hos.getAllPatient();

        System.out.println("enter the address");

        hos.getPatientByAddress(sc.next());

        System.out.println("enter the wardno:");

        String str = hos.getPatientNameByWardNo(sc.next());

        System.out.println("the patientname is:" + str);

        System.out.println("enter the diseseName");

        hos.getPatientNameByDiseaseName(sc.next());

        System.out.println("enter the patientname:");

        String a = sc.next();

        System.out.println("enter the disease:");

        String b = sc.next();

        hos.updatePatientDiseaseByPatientName(a,b);

        System.out.println("enter the id:");

        int a1 = sc.nextInt();

        System.out.println("enter the wrdNo:");

        String b1 = sc.next();

        hos.updatePatientWardNoByPatientId(a1,b1);

        System.out.println("enter the id:");

        int id = sc.nextInt();

        System.out.println("enter the age");

        int age = sc.nextInt();

        hos.updatePatientAgeByPatientId(id,age);

        System.out.println("enter the patientId:");

        hos.getPatientById(sc.nextInt());

        System.out.println("enter the patientid:");

        String s1 = hos.getPatientAttenderNameByPatientId(sc.nextInt());

        System.out.println(s1);























    }







}
