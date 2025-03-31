package com.ithem_03;

public class Studentdemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("赵雅芝");
        System.out.println(s);
        System.out.println(s.getName()+":"+s.getAge());

    }
}
