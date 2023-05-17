package com.xworkz.libraryapp;

public class Library {

                   String books[] = new String[5];

                   int index;

                   public boolean addBooks(String book){

                       boolean isAdded = false;

                       if(book!=null && index< books.length){

                          books[index++] = book;

                           isAdded = true;
                       }

                       return isAdded;

                   }

                   public void getBooks(){

                      for(int i =0;i<books.length;i++){

                          System.out.println(books[i]);

                      }



                   }









}
