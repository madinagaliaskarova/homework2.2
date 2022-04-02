package com.company;

public class Mother extends GrandMother implements Printable {
    private String profession;


    public Mother(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public void print() {
        System.out.println("Mother info: " + getName() + " " + getAge() + " " + getProfession());
    }


}
