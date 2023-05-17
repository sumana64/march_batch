package com.xworkz.theaterapp;

import java.util.Scanner;

public class TheaterTester {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Theater th = new Theater();

            for(int i = 0;i<th.movies.length;i++){

                System.out.println("enter the movie:");

                String movie = sc.next();

                th.addMovies(movie);

            }

                th.getMovies();









    }









}
