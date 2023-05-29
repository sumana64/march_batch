package com.xworkz.relationshiopapp.factory;

public class FactoryTester {

    public static void main(String[] args) {

       Machines machines = new Machines();

       Factory factory = new Factory(machines);

       factory.machines.createProducts();





    }
}
