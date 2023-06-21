package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital{

    Patient patient[] = new Patient[2];

    int index;
    @Override
    public boolean addPatient(Patient patient) {
        boolean isAdded = false;
        if(patient!=null) {
            System.out.println("patient check is done..patient can be addded");
            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getPhoneNo()>0 && patient.getBloodGroup()!=null && patient.getGender()!=null) {
                    this.patient[index++] = patient;
                    isAdded = true;
                    System.out.println("patient is added successfully");
                } else {

                    System.out.println("patient is not added suucessfully");
                }

            } else {

                System.out.println("patient is null");
            }

        return isAdded;
    }

    @Override
    public void getAllPatient() {

        System.out.println("get all the patient details");

        System.out.println("list of patients");

        for (Patient pat:this.patient) {

            System.out.println(pat);
        }

    }



}
