package com.xworkz.libraryapp;

import java.util.Scanner;

public class LibraryTester {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          Library lib = new Library();

          for(int i=0;i<lib.books.length;i++){

              System.out.println("enter the book:");

              String book = sc.next();

              lib.addBooks(book);

          }

              lib.getBooks();

    }









}
