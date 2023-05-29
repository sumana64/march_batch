package com.xworkz.relationshiopapp.movie;

public class TheaterTester {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        Theater theater = new Theater(ticket);

        theater.ticket.toAllow();
    }








}
