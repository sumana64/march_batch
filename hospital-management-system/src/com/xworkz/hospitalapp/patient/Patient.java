package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Document;
import com.xworkz.hospitalapp.constant.Gender;
import lombok.*;

@Data
@ToString
public class Patient {


         int patientId;

         String patientName;

         int age;

         String bloodGroup;

         Gender gender;

         Document document;

         long phoneNo;

         String wardNo;

         String diseaseName;

         String attender;

         String location;






}
