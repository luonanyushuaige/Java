package com.ithem_04;

public class Student01 {

    private String name;
    private int age;

    public Student01() {}

    public Student01(String name, int age) {
        this.age =age;
        this.name =name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println(this.name + "," + this.age);
    }
}
