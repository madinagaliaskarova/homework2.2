package com.company;

public class Daughter extends GrandMother implements Printable{
    private String hobby;


    public Daughter(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public void print() {
        System.out.println("Daughter info: " + getName() + " " + getAge() + " " + getHobby());
    }

}
