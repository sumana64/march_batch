package com.xworkz.orionmallapp;

public class OrionMall {

              String shops[] = new String[5];

              int index;

              public boolean addShops(String shop){

                    boolean isAdded = false;

                    if(shop!=null && index<shops.length){

                        shops[index++] = shop;

                          isAdded = true;
                    }

                    return isAdded;

              }

              public void getShops(){

                  System.out.println("inside the getShops method");

                  for(int i=0;i<shops.length;i++){

                      System.out.println(shops[i]);
                  }

              }









}
