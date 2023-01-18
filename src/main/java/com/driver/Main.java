package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        //RWOnly obj=new RWOnly("Manish");
        //System.out.println(obj.name);
        //constructor RWOnly in class com.driver.RWOnly cannot be applied to given types;
        //name has private access in com.driver.RWOnly
        obj.setName("Mannu");
        System.out.println(obj.getName());
    }
}