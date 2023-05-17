package com.xworkz.mobileshop;

public class MobileShop {

               String mobiles[] = new String[5];

               int index;

               public boolean addMobiles(String mobile){

                       boolean isAdded = true;

                       if(mobile!=null && index<mobiles.length){

                             mobiles[index++] = mobile;

                                isAdded = true;

                       }
                       return isAdded = false;

               }

               public void getMobiles(){

                   for(int i=0;i<mobiles.length;i++){

                       System.out.println(mobiles[i]);
                   }

               }




}
