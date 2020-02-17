package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        petName = name;
        petAge = age;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        petAge = age;
        petName = "Cat name";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        petName = name;
        petAge = 0;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        petName = "Cat name";
        petAge = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
