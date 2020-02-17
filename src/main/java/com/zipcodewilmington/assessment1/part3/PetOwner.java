package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String ownerName = "";
    Pet[] petOwned;
    int numofpet = 0;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        ownerName = name;
        petOwned = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        numofpet++;
        petOwned[numofpet] = pet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        petOwned[0] = null;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean answer = false;
        for(int x = 0; x <= petOwned.length -1; x++){
            if(petOwned[x].equals(pet)){
                answer = true;
                break;
            }
        }
        return answer;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer oldest = this.getOldestPetAge();
        Integer youngest = oldest;
        for(int x = 0; x <= petOwned.length -1; x++){
            if(petOwned[x].getAge() < oldest){
                youngest = petOwned[x].getAge();
            }
        }
        return youngest;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = 0;
        for(int x = 0; x <= petOwned.length -1; x++){
            if(petOwned[x].getAge() > oldest){
                oldest = petOwned[x].getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer ageTotal = 0;
        for(int x = 0; x <= petOwned.length -1; x++){
            ageTotal += petOwned[x].getAge();
        }
        double answer  = ageTotal / petOwned.length;

        return (float)answer;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petOwned.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return petOwned;
    }
}
