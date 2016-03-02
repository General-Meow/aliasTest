package com.pandemic.beans;

public class Animal {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void doSomethingWithMyPrivates()
    {
        System.out.println("I'm " + name + " and i'm fiddling bit me bits");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
