package com.company;

public class GrandDaughter extends GrandMother implements Printable {
    private String favoriteFood;

    public GrandDaughter(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public void print() {
        System.out.println("GrandDaughter info: " + getName() + " " + getAge() + " " + getFavoriteFood());

    }
}
