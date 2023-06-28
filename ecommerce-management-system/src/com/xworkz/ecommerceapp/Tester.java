package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.constant.Gender;
import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.customer.EcommerceApp;
import com.xworkz.ecommerceapp.impl.AppImpl;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size:");

        int size = sc.nextInt();

        EcommerceApp app = new AppImpl(size);

        for (int customerIndex=0;customerIndex<size;customerIndex++){

            Customer customer = new Customer();
            System.out.println("enter the id:");
            customer.setId(sc.nextInt());
            System.out.println("enter the name:");
            customer.setName(sc.next());
            System.out.println("enter the phoneNo:");
            customer.setPhoneNo(sc.nextLong());
            System.out.println("enter the password:");
            customer.setPassword(sc.next());
            System.out.println("enter the address:");
            customer.setAddress(sc.next());
            System.out.println("enter the gender:");
            customer.setGender(Gender.valueOf(sc.next()));

            app.createCustomer(customer);

        }
        String text = null;
        do{

            System.out.println("1.get customerInfo");
            System.out.println("2.getCustomerNameByPassword");
            System.out.println("3.getCustomerById");
            System.out.println("4.updateCustomerNoByName");
            System.out.println("5.updateCustomerPasswordByPhoneNo");
            System.out.println("6.getCustomerAddressByName");
            System.out.println("7.updatePhoneById");
            System.out.println("8.getCustomerByPassword");
            System.out.println("enter the option");
            int option = sc.nextInt();
            switch (option){
                 case 1:app.getCustomerInfo();
                        break;

                 case 2:System.out.println("enter the password");
                        String str = app.getCustomerNameByPassword(sc.next());
                        System.out.println(str);
                        break;

                 case 3:System.out.println("enter the id:");
                        app.getCustomerById(sc.nextInt());
                        break;

                 case 4:System.out.println("enter the name:");
                        String s1 = sc.next();
                        System.out.println("enter the phoneNo:");
                        long phone = sc.nextLong();
                        app.updateCustomerNoByName(s1,phone);
                        break;

                 case 5: System.out.println("enter the phoneNo:");
                         long phone1 = sc.nextLong();
                         System.out.println("enter the password:");
                         String pass = sc.next();
                         app.updateCustomerPasswordByPhoneNo(phone1,pass);
                         break;

                case 6: System.out.println("enter the name:");
                        String name = sc.next();
                        String st = app.getCustomerAddressByName(name);
                        System.out.println(st);
                        break;

                case 7: System.out.println("enter the id:");
                        int id = sc.nextInt();
                        System.out.println("enter the phoneNo:");
                        long ph = sc.nextLong();
                        app.updatePhoneById(id,ph);
                        break;

                case 8: System.out.println("enter the password");
                        Customer cust = app.getCustomerByPassword(sc.next());
                        System.out.println(cust);
                        break;


                 }
            System.out.println("want to continue or not : y/n");
            text = sc.next();
        }while(text.equals("y"));


    }



}
