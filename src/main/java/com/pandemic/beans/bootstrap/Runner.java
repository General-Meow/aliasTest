package com.pandemic.beans.bootstrap;

import com.pandemic.beans.Animal;
import com.pandemic.beans.Cat;

public class Runner {

    private Animal animal1;
    private Cat cat;

    public void run(){
        System.out.println("running...");
        System.out.println(animal1);
        System.out.println(cat);

        //some changes
        cat.decorateAnInheritedMethod();
        cat.doSomethingWithMyPrivates();
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
