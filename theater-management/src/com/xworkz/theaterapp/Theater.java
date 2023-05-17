package com.xworkz.theaterapp;

public class Theater {

                   String movies[] = new String[5];

                   int index;

                   public boolean addMovies(String movie) {

                       boolean isAdded = false;

                       System.out.println("inside addMovies method");

                       if (movie != null && index < movies.length) {

                           movies[index++] = movie;

                           isAdded = true;
                       }

                   return isAdded;
                   }

                   public void getMovies(){

                      System.out.println("inside the getMovies");

                      for(int i=0;i< movies.length;i++) {

                           System.out.println(movies[i]);

                      }

                   }










}
