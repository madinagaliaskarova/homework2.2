package com.company;

public class GrandMother implements Printable
{
    private String name;
    private int age;


    public GrandMother(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println("Grandmother parametr " + name + "age " + age);
    }


}
