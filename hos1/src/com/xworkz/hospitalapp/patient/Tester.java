package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.patient.constant.*;
import com.xworkz.hospitalapp.patient.hospital.Hospital;
import com.xworkz.hospitalapp.patient.hospital.ManipalImpl;
import com.xworkz.hospitalapp.patient.patient.Patient;

import java.awt.*;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size:");

        int size = sc.nextInt();

        Hospital hos = new ManipalImpl(size);


        for (int patientIndex = 0; patientIndex < size; patientIndex++) {

            Address address = new Address();
            Country country = new Country();
            State state = new State();
            City city = new City();
            Area area = new Area();
            Street street = new Street();

            System.out.println("enter the area:");
            area.setArea(sc.next());
            System.out.println("enter the city");
            city.setCity(sc.next());
            System.out.println("enter the state");
            state.setState(sc.next());
            System.out.println("enter the country");
            country.setCoutry(sc.next());
            System.out.println("enter the street");
            street.setStreet(sc.next());


            Patient patient = new Patient();
            System.out.println("enter the patinetid:");
            patient.setPatientId(sc.nextInt());
            System.out.println("enter the patientName:");
            patient.setPatientName(sc.next());
            System.out.println("enter the address:");
            patient.setAddress1(sc.next());
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
            patient.setAddress(address);

            address.setCountry(country);
            country.setState(state);
            state.setCity(city);
            city.setArea(area);
            area.setStreet(street);


            hos.createPatient(patient);


        }

        String text = null;
        do {

            System.out.println("1.get all the patient info");
            System.out.println("2.getPatientByAddress ");
            System.out.println("3.getPatientNameByWardNo");
            System.out.println("4.getPatientNameByDiseaseName");
            System.out.println("5.updatePatientDiseaseByPatientName");
            System.out.println("6. updatePatientWardNoByPatientId");
            System.out.println("7.updatePatientAgeByPatientId");
            System.out.println("8.getPatientById");
            System.out.println("9.getPatientAttenderNameByPatientId");

            System.out.println("enter the option");

            int option = sc.nextInt();

            switch (option) {

                case 1: hos.getAllPatient();

                    break;

                case 2: System.out.println("enter the address");

                    hos.getPatientByAddress(sc.next());

                    break;

                case 3: System.out.println("enter the wardno:");

                    String str = hos.getPatientNameByWardNo(sc.next());

                    System.out.println("the patientname is:" + str);

                    break;

                case 4: System.out.println("enter the diseseName");

                    String str1 = sc.next();

                    System.out.println("enter the size:");

                    int no = sc.nextInt();

                    String[] str2 = hos.getPatientNameByDiseaseName(str1,no);

                    for (String s1 : str2) {

                        System.out.println(s1);
                    }

                    break;


                case 5: System.out.println("enter the patientname:");

                    String a = sc.next();

                    System.out.println("enter the disease:");

                    String b = sc.next();

                    hos.updatePatientDiseaseByPatientName(a, b);

                    break;

                case 6: System.out.println("enter the id:");

                    int a1 = sc.nextInt();

                    System.out.println("enter the wrdNo:");

                    String b1 = sc.next();

                    hos.updatePatientWardNoByPatientId(a1, b1);

                    break;

                case 7: System.out.println("enter the id:");

                    int id = sc.nextInt();

                    System.out.println("enter the age");

                    int age = sc.nextInt();

                    hos.updatePatientAgeByPatientId(id, age);

                    break;

                case 8: System.out.println("enter the patientId:");

                    hos.getPatientById(sc.nextInt());

                    break;

                case 9: System.out.println("enter the patientid:");

                    String s1 = hos.getPatientAttenderNameByPatientId(sc.nextInt());

                    System.out.println(s1);

                    break;

                case 10:System.out.println("enter the id:");

                       hos.getStreetNameByPatientId(sc.nextInt());


            }
            System.out.println("do you want to continue:y/n");
            text = sc.next();

        } while (text.equals("y"));


    }

}
