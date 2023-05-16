package com.xworkz.bookapp;

public class BookTester {

    public static void main(String args[]){

        Book.addBookNames("Oliver Twist");
        Book.addBookNames("Beloved");
        Book.addBookNames("MiddleMarch");
        Book.addBookNames("Animalfarm");
        Book.addBookNames("Skyfire");
        Book.addBookNames("you can win");
        Book.addBookNames("guide");
        Book.addBookNames("indian war");
        Book.addBookNames("Asura");
        Book.addBookNames("balck river");
        Book.addBookNames("1619");
        Book.addBookNames("great circle");
        Book.addBookNames("stephan king");
        Book.addBookNames("virtue");
        Book.addBookNames("just us");
        Book.addBookNames("indian girl");

        String book = Book.getbookName("sun");

        System.out.println(book);

        boolean ref = Book.updateName("1619","AntiSocial");

        System.out.println("the book is updated :" + ref);

        Book.getBookNames();


    }










}
