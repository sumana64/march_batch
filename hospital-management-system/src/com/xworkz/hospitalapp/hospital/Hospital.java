package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {

           boolean addPatient(Patient patient);

           void getAllPatient();

           Patient getPatientByAddress(String location);

           String getPatientNameByWardNo(String wardNo);

           boolean updatePatientDiseaseByPatientName(String existingPatientName,String updatedDiseasename);

           boolean updatePatientWardNoByPatientId(int existingId,String updatedwardNo);

           String[] getPatientNameByDiseaseName(String diseaseName);
}
