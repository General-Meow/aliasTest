package com.pandemic.beans;

public class Cat extends Animal {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void decorateAnInheritedMethod()
    {
        System.out.println("I'm " + name + " and im warming up my hands");
        doSomethingWithMyPrivates();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
