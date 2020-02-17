package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        for(int x = 0; x <= intArray.length - 1; x++){
            sum += intArray[x];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer product = 1;
        for(int x = 0; x <= intArray.length - 1; x++){
            product *= intArray[x];
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double sum = 0.00;
        for(int x = 0; x <= intArray.length - 1; x++){
            sum += intArray[x];
        }
        Double average = sum / intArray.length;
        return average;
    }
}
