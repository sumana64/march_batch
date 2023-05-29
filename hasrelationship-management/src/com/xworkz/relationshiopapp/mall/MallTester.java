package com.xworkz.relationshiopapp.mall;

public class MallTester {

    public static void main(String[] args) {

         Shops shop = new Shops();

         Mall mall = new Mall(shop);

         mall.shop.doBussiness();


    }





}
