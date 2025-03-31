package com.ithem_02;

public class student {
    String name;
    private int age;

    public void study(){
        System.out.println("好好学习，天天向上");

    }
    public void dohomework(){
        System.out.println("键盘敲烂，工资过万");
    }
    public void show(){
        System.out.println(name + ':' +age);
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }


}
