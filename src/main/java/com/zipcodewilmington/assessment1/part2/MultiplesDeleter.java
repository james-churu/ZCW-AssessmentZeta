package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints){
        Integer occurences = 0;
        for(int x = 0; x <= ints.length - 1; x++){
            if(ints[x] %2 == 0){
                occurences++;
            }
        }
        Integer[] newArray = new Integer[ints.length - occurences];

        int currentIndx = 0;

        for(int x = 0; x <= ints.length -1; x++){
            if(ints[x] %2 == 0){

            }else{
                newArray[currentIndx] = ints[x];
                currentIndx++;
            }
        }
        return newArray;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer occurences = 0;
        for(int x = 0; x <= ints.length - 1; x++){
            if(ints[x] %2 != 0){
                occurences++;
            }
        }
        Integer[] newArray = new Integer[ints.length - occurences];

        int currentIndx = 0;

        for(int x = 0; x <= ints.length -1; x++){
            if(ints[x] %2 != 0){

            }else{
                newArray[currentIndx] = ints[x];
                currentIndx++;
            }
        }
        return newArray;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer occurences = 0;
        for(int x = 0; x <= ints.length - 1; x++){
            if(ints[x] %3 == 0){
                occurences++;
            }
        }
        Integer[] newArray = new Integer[ints.length - occurences];

        int currentIndx = 0;

        for(int x = 0; x <= ints.length -1; x++){
            if(ints[x] %3 == 0){

            }else{
                newArray[currentIndx] = ints[x];
                currentIndx++;
            }
        }
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer occurences = 0;
        for(int x = 0; x <= ints.length - 1; x++){
            if(ints[x] %multiple == 0){
                occurences++;
            }
        }
        Integer[] newArray = new Integer[ints.length - occurences];

        int currentIndx = 0;

        for(int x = 0; x <= ints.length -1; x++){
            if(ints[x] %multiple == 0){

            }else{
                newArray[currentIndx] = ints[x];
                currentIndx++;
            }
        }
        return newArray;
    }
}
