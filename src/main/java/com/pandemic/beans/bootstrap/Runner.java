package com.pandemic.beans.bootstrap;

import com.pandemic.beans.Animal;

public class Runner {

    private Animal animal1;
    private Animal animal2;

    public void run(){
        System.out.println("running...");
        System.out.println(animal1);
        System.out.println(animal2);
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }
}
