package com.xworkz.ecommerceapp.customer;

public interface EcommerceApp {


                  boolean createCustomer(Customer customer);

                  void getCustomerInfo();

                  String getCustomerNameByPassword(String password);

                  Customer getCustomerById(int id);

                  boolean updateCustomerNoByName(String name,long updatePhoneNo);

                  boolean updateCustomerPasswordByPhoneNo(long phoneNo,String updatePassword);

                  String getCustomerAddressByName(String name);

                  boolean updatePhoneById(int id,long updatePhoneNo);

                  Customer getCustomerByPassword(String password);













}
