package com.ithem_02;

public class studentdemo {
    public static void main(String[] args) {
//        student s = new student();
//        System.out.println(s);
//        System.out.println(s.name + ","+s.age);
//
//        s.age = 18;
//        s.name = "Harry";
//        System.out.println(s.name + ","+s.age);
//        s.study();
//        s.dohomework();
//        System.out.println("");
//
//        student s2 = new student();
//        System.out.println(s2);
//        System.out.println(s2.name + ","+s2.age);
//
//        s2.age = 20;
//        s2.name = "Harry";
//        System.out.println(s2.name + ","+s2.age);
//        s2.study();
//        s2.dohomework();





        student s = new student();
        s.name = "林青霞";
        s.setAge(18);
        System.out.println(s.getAge());

        s.show();
    }
}
