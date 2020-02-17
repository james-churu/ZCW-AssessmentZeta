package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        petName = name;
        petAge = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        petAge = age;
        petName = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        petName = name;
        petAge = 0;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        petName = "Dog name";
        petAge = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
