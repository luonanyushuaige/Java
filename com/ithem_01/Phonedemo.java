package com.ithem_01;

public class Phonedemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.price);
        System.out.println(p.brand);

        p.brand = "小米";
        p.price = 1999;

        System.out.println(p.price);
        System.out.println(p.brand);

        p.call();
        p.sendmessage();
    }
}
