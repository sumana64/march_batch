package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital {

    Patient patient[];

    public ApolloHospitalImpl(int size) {

        patient = new Patient[size];
    }

    int index;

    @Override
    public boolean addPatient(Patient patient) {
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("patient check is done..patient can be addded");
            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getPhoneNo() > 0 && patient.getBloodGroup() != null && patient.getGender() != null) {
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

        for (Patient pat : this.patient) {

            System.out.println(pat);
        }

    }

    @Override
    public Patient getPatientByAddress(String location) {
        System.out.println("getPatientByAddress method");
           Patient pat = null;
        for (int i = 0; i < this.patient.length; i++) {
            if (location!= null) {
                if (this.patient[i].getLocation().equals(location)) {
                     System.out.println(this.patient[i]);
                } else {

                    System.out.println("location is not found");
                }

            } else {
                System.out.println("location is not null");
            }
        }
   return pat;

    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("getPatientNameByWardNo method");
        System.out.println("invoking patientName");
           for(int i=0;i<patient.length;i++){
               if(wardNo!=null){

                   if(this.patient[i].getWardNo().equals(wardNo)){

                       return patient[i].getPatientName();
                   }

               }else{

                   System.out.println("patient is not null");
               }
           }

        return "patient name is not found";
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingPatientName,String updatedDiseasename) {
        System.out.println("updatePatientDiseaseByPatientName");
        boolean isUpdated = false;
        for(int i=0;i<this.patient.length;i++){
            if(existingPatientName!=null && updatedDiseasename!=null) {
                if (this.patient[i].getPatientName().equals(existingPatientName)) {
                    patient[i].setDiseaseName(updatedDiseasename);
                    isUpdated = true;
                }else{

                    System.out.println("diseasename is not updated");
                }

            }else{

                System.out.println("patientname nd diseasename is null");
            }

        }
        return isUpdated;
    }

    public boolean updatePatientWardNoByPatientId(int existingId,String updatedwardNo){

        System.out.println("updatePatientWardNoByPatientId");
           boolean isUpdated = true;
                for(int i=0;i<patient.length;i++){
                   if(existingId>0 && updatedwardNo!=null){

                       if(patient[i].getPatientId() == existingId){

                           patient[i].setWardNo(updatedwardNo);

                       }else{

                           System.out.println("wardNo is not updated");
                       }
                   }else{

                       System.out.println("existingid nd updatewardno is null");
                   }

                }
        return isUpdated;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {

          System.out.println("invoking updatePatientNameByDiseaseName method");

        for (int i = 0; i < patient.length; i++) {

            if (diseaseName != null) {

                if (patient[i].getDiseaseName().equals(diseaseName)) {

                    StringBuilder patientName = new StringBuilder();
                    patientName = patientName.append(patient[i].getPatientName());
                    System.out.println(patient[i].getPatientName());


                }else{

                    System.out.println("diseasename is not found");
                }

            }else{

                System.out.println("disesae is not null");
            }


        }

        return null;
    }

    }