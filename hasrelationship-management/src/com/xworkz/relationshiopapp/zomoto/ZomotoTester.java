package com.xworkz.relationshiopapp.zomoto;

public class ZomotoTester{

    public static void main(String[] args) {

        DeliveryBoys boys = new DeliveryBoys();

        Zomoto zomoto = new Zomoto(boys);

        zomoto.deliveryBoys.deliveryFood();


    }



}
