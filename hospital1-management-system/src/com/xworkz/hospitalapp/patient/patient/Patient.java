package com.xworkz.hospitalapp.patient.patient;

import com.xworkz.hospitalapp.patient.constant.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class Patient {

                int patientId;
                String patientName;
                int age;
                String Address;
                String wardNo;
                String attender;
                long phoneNo;
                String diseaseName;
                String bloodGroup;
                Gender gender;














}
