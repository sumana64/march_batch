package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Document;
import com.xworkz.hospitalapp.constant.Gender;
import lombok.*;

@Data
public class Patient {

         String patientName;

         int age;

         String bloodGroup;

         Gender gender;

         Document document;

         long phoneNo;





}
