package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String ownerName = "";
    ArrayList<Pet> petlist = new ArrayList<>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.ownerName = name;
        if(pets != null){
            for(Pet element: pets){
                this.petlist.add(element);
                element.setOwner(this);
            }
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petlist.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.petlist.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean answer = false;
        for(int x = 0; x <= petlist.size() -1; x++){
            if(petlist.get(x).equals(pet)){
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
        for(int x = 0; x <= petlist.size() -1; x++){
            if(petlist.get(x).getAge() < oldest){
                youngest = petlist.get(x).getAge();
            }
        }
        return youngest;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = 0;
        for(int x = 0; x <= petlist.size() -1; x++){
            if(petlist.get(x).getAge() > oldest){
                oldest = petlist.get(x).getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer ageTotal = 0;
        for(int x = 0; x <= petlist.size() -1; x++){
            ageTotal += petlist.get(x).getAge();
        }
        double answer  = ageTotal / petlist.size();

        return (float)answer;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petlist.size();
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
        Pet[] answer = new Pet[petlist.size()];

        if(petlist.size() == 0){
            Pet[] nopet = new Pet[1];
            nopet[0] = null;
            return nopet;
        }
        for(int x = 0; x < petlist.size(); x++){
            answer[x] = petlist.get(x);
        }
        return answer;
    }
}
