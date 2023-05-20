package com.xworkz.hospitalapp;

public class Patient1 {

               private int patientId;

               private String patientName;

               private int age;

               private long phoneNumber;

               private boolean isPatientAdded;

               private String bloodgroup;

               private String attenderName;

               public Patient1(){

                    System.out.println("constructor is created");

                }

                public void setPatientId(int patientId){

                    this.patientId = patientId;
                }

                public int getPatientId(){

                    return patientId;
                }

                public void setPatientName(String patientName){

                        this.patientName = patientName;
                }

                public String getPatientName(){

                    return patientName;
                }

                public void setAge(int age){

                    this.age = age;
                }

                public int getAge(){

                    return age;
                }

                public void setPhoneNumber(long phoneNumber){

                    this.phoneNumber = phoneNumber;
                }

                public long getPhoneNumber(){

                    return phoneNumber;
                }

                public void setIsPatientAdded(boolean isPatientAdded){

                    this.isPatientAdded = isPatientAdded;
                }

                public boolean getIsPatientAdded(){

                    return isPatientAdded;
                }

                public void setBloodgroup(String bloodgroup){

                    this.bloodgroup = bloodgroup;
                }

                public String getBloodgroup(){

                    return bloodgroup;
                }

                public void setAttenderName(String attenderName){

                    this.attenderName = attenderName;
                }

                public String getAttenderName(){

                    return getAttenderName();
                }







}















