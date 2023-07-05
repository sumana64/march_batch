package com.xworkz.hospitalapp.patient.hospital;

import com.xworkz.hospitalapp.patient.exception.AddressNotFoundException;
import com.xworkz.hospitalapp.patient.exception.DiseaseNotFoundException;
import com.xworkz.hospitalapp.patient.exception.IdNotFoundException;
import com.xworkz.hospitalapp.patient.exception.WardNotFoundException;
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
            if(patient1.getAddress1().equals(address)){
                pat = patient1;
                System.out.println(patient1);
            }else{
                AddressNotFoundException exception = new AddressNotFoundException(address);
                throw exception;
            }
        }
        return pat;
    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        String patientName = null;
        System.out.println("getPatientNameByWardNo");
        for (Patient patient : this.patient) {
            if (patient.getWardNo().equals(wardNo) && patient.getWardNo()!=null) {
                patientName = patient.getPatientName();
            
            }else{
                WardNotFoundException exception = new WardNotFoundException(wardNo);
                throw exception;
            }
        }


        return patientName;
    }



    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName,int size){
        String[] patientName = new String[size];
        System.out.println("getPatientNameByDiseaseName method");
        for (Patient patient1:patient) {
            if(patient1.getDiseaseName().equals(diseaseName)){
                    patientName[index++] = patient1.getPatientName();
            }else{
                DiseaseNotFoundException exception = new DiseaseNotFoundException(diseaseName);
                throw exception;
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
            }else{

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
                System.out.println("patient wardNo is not updated");
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
                 IdNotFoundException exception = new IdNotFoundException(patientId);
                 throw exception;
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

    @Override
    public String getStreetNameByPatientId(int id) {
        System.out.println("streetNameByPatientId method");
        for (Patient patient1:patient) {
            if(patient1.getPatientId() == id){
                System.out.println("street name is: " + patient1.getAddress().getCountry().getState().getCity().getArea().getStreet());
            }
        }
        return null;
    }
}
