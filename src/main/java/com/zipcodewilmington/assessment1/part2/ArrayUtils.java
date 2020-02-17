package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer occurences = 0;
        for(int x = 0; x <= objectArray.length - 1; x++){
            if(objectArray[x].equals(objectToCount)){
                occurences++;
            }
        }
        return occurences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer occurences = 0;
        for(int x = 0; x <= objectArray.length - 1; x++){
            if(objectArray[x].equals(objectToRemove)){
                occurences++;
            }
        }

        Integer[] newArray = new Integer[objectArray.length - occurences];

        int currentIndx = 0;

        for(int x = 0; x < objectArray.length -1; x++){
            if(objectArray[x] == (objectToRemove)){

            }else{
                newArray[currentIndx] = (Integer) objectArray[x];
                currentIndx++;
            }
        }
        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int counter = 0;
        int topOccur = 0;
        Object word = null;

        while(counter <= objectArray.length -1){
            int occurences = 0;
            for(int x = 0; x <= objectArray.length -1;x++){
                if(objectArray[counter] == objectArray[x]){
                    occurences++;
                }
            }
            if(occurences > topOccur) {
                word = objectArray[counter];
                topOccur = occurences;
            }
            counter++;
        }
        return word;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int counter = 0;
        int topOccur = objectArray.length;
        Object word = null;

        while(counter <= objectArray.length -1){
            int occurences = 0;
            for(int x = 0; x <= objectArray.length -1;x++){
                if(objectArray[counter] == objectArray[x]){
                    occurences++;
                }
            }
            if(occurences < topOccur) {
                word = objectArray[counter];
                topOccur = occurences;
            }
            counter++;
        }
        return word;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int newSize = objectArray.length + objectArrayToAdd.length;
        Object[] newArr = new Integer[newSize];

        for(int x = 0; x <= objectArray.length -1; x++){
            newArr[x] = objectArray[x];
        }
        int pos = objectArray.length;
        for(int x = 0; x <= objectArrayToAdd.length -1; x++){
            newArr[pos] = objectArrayToAdd[x];
            pos++;
        }
        return newArr;
    }
}
