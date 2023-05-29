package com.xworkz.relationshiopapp.exam;

public class HallTicket {

          String rollNo;
          String candidateName;
          String subjectName;

          public HallTicket(){

              System.out.println("hallticket is created");

          }

          public void display(){

              System.out.println("student name is:" + this.candidateName);
              System.out.println("student rollNo is:" + this.rollNo);
              System.out.println("subject name is:" + this.subjectName);


          }

}
