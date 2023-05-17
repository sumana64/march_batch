package com.xworkz.restaurant;

public class Restaurant {

               String food[] = new String[5];

               int index;

               public boolean addMenu(String menu){

                   boolean isAdded = false;

                   System.out.println("inside the addMenu");

                    if(menu!=null && index<food.length){

                         food[index++] = menu;

                           isAdded = true;

                    }
                    return isAdded;

               }

               public void getMenus(){

                   System.out.println("inside the getMenu method");

                   for(int i=0;i<food.length;i++){

                       System.out.println(food[i]);
                   }



               }

               public boolean update(String oldfood, String newfood){

                       boolean isUpdated = false;

                       for(int i=0;i<food.length;i++){

                           if(food[i].equals(oldfood)){

                               food[i] = newfood;

                               isUpdated = true;

                           }


                       }

                  return isUpdated;
               }

               public String getMenu(String menu){

                  for(int i=0;i< food.length;i++){

                      if(food[i].equals(menu)) {

                          System.out.println("food is found");

                          return food[i];

                      }

                  }



                 return "food is not found";
               }










}
