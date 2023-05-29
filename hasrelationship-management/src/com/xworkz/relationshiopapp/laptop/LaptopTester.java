package com.xworkz.relationshiopapp.laptop;

public class LaptopTester {

    public static void main(String[] args) {

        HardDisk hardDisk = new HardDisk();

        Laptop laptop = new Laptop(hardDisk);

        laptop.hardDisk.doProcess();









    }










}
