package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    int petAge = 0;
    String petName = "";
    PetOwner petOwner;
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        petName = name;
        petAge = 0;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        petAge = age;
        petName = "";

    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.petName = name;
        this.petAge = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.petName;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return petAge;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        this.petOwner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return petOwner;
    }
}
