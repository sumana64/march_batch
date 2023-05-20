package com.xworkz.bankapp;

public class Bank {

                int id;
                String accountNo;

                int branchNo;

                String accountType;

                String ifscCode;

                String location;

                public Bank() {

                    System.out.println("constructor is created");

                }
                public int getId() {
                   return id;
                 }

                public void setId(int id) {
                      this.id = id;
                }

               public String getAccountNo() {
                      return accountNo;
                }

                public void setAccountNo(String accountNo) {
                     this.accountNo = accountNo;
                }

                public int getBranchNo() {
                      return branchNo;
                }

                public void setBranchNo(int branchNo) {

                    this.branchNo = branchNo;
                 }

                 public String getAccountType() {

                    return accountType;
                  }
                  public void setAccountType(String accountType) {

                    this.accountType = accountType;
                  }

                  public String getIfscCode() {

                    return ifscCode;
                   }

                  public void setIfscCode(String ifscCode) {

                    this.ifscCode = ifscCode;
                  }

                  public String getLocation() {

                    return location;
                  }

                  public void setLocation(String location) {

                    this.location = location;
                  }




































}
