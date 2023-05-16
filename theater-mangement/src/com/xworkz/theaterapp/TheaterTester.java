package com.xworkz.theaterapp;

public class TheaterTester {

    public static void main(String args[]){


        Theater.addMovieNames("googly");
        Theater.addMovieNames("tarak");
        Theater.addMovieNames("kgf");
        Theater.addMovieNames("pushpaka vimana");
        Theater.addMovieNames("kantara");
        Theater.addMovieNames("jollydays");
        Theater.addMovieNames("gurushishyaru");
        Theater.addMovieNames("veda");
        Theater.addMovieNames("3 idiots");
        Theater.addMovieNames("habba");
        Theater.addMovieNames("ABCD");

        String ref = Theater.getMovieName("habba");

        System.out.println(ref);

        Theater.updateMovieName("habba","jaya janakinayaka");

        Theater.getMovieNames();



    }













}
