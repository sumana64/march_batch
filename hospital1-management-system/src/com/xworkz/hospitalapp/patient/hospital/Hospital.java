package com.xworkz.hospitalapp.patient.hospital;

import com.xworkz.hospitalapp.patient.patient.Patient;

public interface Hospital {

              boolean createPatient(Patient patient);

              void getAllPatient();

              Patient getPatientByAddress(String address);

              String getPatientNameByWardNo(String wardNo);

              String[] getPatientNameByDiseaseName(String diseaseName);

              boolean updatePatientDiseaseByPatientName(String existingPatientName,String updatedDisease);

              boolean updatePatientWardNoByPatientId(int existingId,String updatedWardNo);

              boolean updatePatientAgeByPatientId(int existingId,int updatedPatientAge);

                Patient getPatientById(int patientId);

              String getPatientAttenderNameByPatientId(int patientId);








}
