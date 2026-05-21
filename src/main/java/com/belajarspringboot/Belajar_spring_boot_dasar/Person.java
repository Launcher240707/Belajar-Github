package com.belajarspringboot.Belajar_spring_boot_dasar;

public class Person {

    String name;
    String fullName;
    int age;

    Person(String name,String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    void sayhello(){
        System.out.println("Hello name: "+name+" full name: "+fullName+" age: "+age);
    }
}
