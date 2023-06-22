package com.xworkz.hospitalapp.patient.hospital;

import com.xworkz.hospitalapp.patient.patient.Patient;

public class ManipalImpl implements Hospital{

    Patient patient[];

    int index;

    public ManipalImpl(int size){

        patient = new Patient[size];

    }
    @Override
    public boolean createPatient(Patient patient) {
        boolean isCreated = false;
        System.out.println("invoking createPatient method");
        if(patient!=null){
               if(patient.getPatientName()!=null && patient.getPhoneNo()>0 && patient.getGender()!=null){
                   this.patient[index++] = patient;
                   isCreated = true;
                   System.out.println("Patient is added sucessfully");
               }else{
                   System.out.println("patientname is not added successfully");
               }
        }else{
            System.out.println("patient is not null");
        }
        return isCreated;
    }

    @Override
    public void getAllPatient() {
        System.out.println("invoking getAllPatient method");
        for (Patient patient:patient) {
            System.out.println(patient);
        }
    }

    @Override
    public Patient getPatientByAddress(String address) {
        Patient pat = null;
        System.out.println("getPatientByAddress method");
        for (Patient patient1:patient) {
            if(patient1.getAddress().equals(address)){
                pat = patient1;
                System.out.println(patient1);
            }else{
                System.out.println("patinet address is not found");
            }
        }
        return pat;
    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("getPatientNameByWardNo");
        for (Patient patient:this.patient) {
            if(patient.getWardNo().equals(wardNo)){
                return patient.getPatientName();
            }
        }
        return "patientname is not found";
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        String[] patientName = null;
        int index=0;
        System.out.println("getPatientNameByDiseaseName method");
        for (Patient patient1:patient) {
            if(patient1.getDiseaseName().equals(diseaseName)){
                patientName[index++] = patient1.getPatientName();
                for (String str:patientName) {
                    System.out.println(str);
                }
            }

        }
        return patientName;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDisease) {
        System.out.println("updatePatientDiseaseByPatientName method");
        boolean isUpdated = false;
        for (Patient patient1:patient) {
            if(patient1.getPatientName().equals(existingPatientName)){
                 patient1.setDiseaseName(updatedDisease);
                 isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo) {
        boolean isUpdated = false;
        System.out.println(" updatePatientWardNoByPatientId method");
        for (Patient patient1:patient) {
            if(patient1.getPatientId()==existingId){
                patient1.setWardNo(updatedWardNo);
                isUpdated = true;
            }else{
                System.out.println("patientwardNo is not updated");
            }
        }
        return isUpdated;
    }


    @Override
    public boolean updatePatientAgeByPatientId(int existingId, int updatedPatientAge) {
        boolean isUpdated = false;
        System.out.println("updatePatientAgeByPatientId");
        for (Patient patient1:patient) {
            if(patient1.getPatientId() == existingId){
                patient1.setAge(updatedPatientAge);
                isUpdated = true;
            }else{
                System.out.println("patient age is not updated");
            }
        }

        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patientId) {
        Patient pat = null;
        System.out.println("getPatientById");
        for (Patient patient1:patient) {
             if(patient1.getPatientId()==patientId){
                 pat= patient1;
                 System.out.println(patient1);
             }else{
                 System.out.println("id is not found");
             }
        }
        return pat;
    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
        System.out.println("getPatientAttenderNameByPatientId");
        for (Patient patient1:patient) {
            if(patient1.getPatientId() == patientId){
                return patient1.getAttender();
            }
        }

        return "attender is not found";
    }
}
