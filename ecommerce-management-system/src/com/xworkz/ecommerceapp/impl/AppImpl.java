package com.xworkz.ecommerceapp.impl;

import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.customer.EcommerceApp;
import com.xworkz.ecommerceapp.exception.IdNotFoundException;
import com.xworkz.ecommerceapp.exception.NameNotFoundException;
import com.xworkz.ecommerceapp.exception.PasswordNotFoundException;

public class AppImpl implements EcommerceApp {

    Customer customer[];

    int index=0;

    public AppImpl(int size){
        customer = new Customer[size];
    }


    @Override
    public boolean createCustomer(Customer customer) {
        boolean isCreated = false;
        System.out.println("inside the createCustomerapp");
        if(customer!=null) {
            System.out.println("proceed to create customer");
            if (customer.getName() != null && customer.getPhoneNo() > 0 && customer.getPassword() != null) {
                  this.customer[index++] = customer;
            }else{
                System.out.println("customer is added successfully");
            }
        }else{
            System.out.println("customer is null");
        }
        return isCreated;
    }

    @Override
    public void getCustomerInfo() {
        System.out.println("inside the getCustomerInfo");
        for (Customer customer1:customer) {
            System.out.println(customer1);
        }

    }

    @Override
    public String getCustomerNameByPassword(String password) {
        String name = null;
        System.out.println("inside getCustomerNameByPassword method");
        if(password!=null){
            for (Customer customer1:customer) {
                if(customer1.getPassword().equals(password)){
                    name = customer1.getName();
                }
            }
        }else{
            PasswordNotFoundException exception = new PasswordNotFoundException(password);
            throw exception;
        }
        return name;
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer ct = null;
        System.out.println("inside getCustomerById method");
        if(id!=0){
            for (Customer customer1:customer) {
                if(customer1.getId()==id){
                    ct = customer1;
                    System.out.println(customer1);
                }
            }
        }else{
            IdNotFoundException exception = new IdNotFoundException(id);
            throw exception;
        }
        return ct;
    }

    @Override
    public boolean updateCustomerNoByName(String name,long updatePhoneNo) {
        boolean isUpdated = false;
        System.out.println("inside updateCustomerNoByName method");
        for (Customer customer1:customer) {
            if(customer1.getName()!=null){
                customer1.setPhoneNo(updatePhoneNo);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updateCustomerPasswordByPhoneNo(long phoneNo,String updatePassword) {
        boolean isUpdated = false;
        System.out.println("inside updateCustomerPasswordByPhoneNo method");
        for (Customer customer1:customer) {
            if(customer1.getPhoneNo()==phoneNo){
                customer1.setPassword(updatePassword);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public String getCustomerAddressByName(String name) {
        String add = null;
        System.out.println("inside getCustomerAddressByName method");
        for (Customer customer1:customer) {
            if(customer1.getName().equals(name)){
                add = customer1.getAddress();
            }else{
                NameNotFoundException exception = new NameNotFoundException(name);
                throw exception;
            }
        }
        return add;
    }

    @Override
    public boolean updatePhoneById(int id, long updatePhoneNo) {
        boolean isUpdated = false;
        System.out.println("updatePhoneById method");
        for (Customer customer1:customer) {
            if(customer1.getId() == id){
                customer1.setPhoneNo(updatePhoneNo);
                isUpdated = true;
            }
        }

        return isUpdated;
    }

    @Override
    public Customer getCustomerByPassword(String password) {
        Customer customer = null;
        System.out.println("inside getCustomerByPassword method");
        for (Customer customer1:this.customer) {
            if(customer1.getPassword().equals(password)){
                customer = customer1;
            }
        }
        return customer;
    }
}
