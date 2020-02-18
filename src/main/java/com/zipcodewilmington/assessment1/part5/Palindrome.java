package com.zipcodewilmington.assessment1.part5;

public class Palindrome {


    public Integer countPalindromes(String input){

        Integer count = 0;

        for(int x = 0; x <= input.length(); x++){

            for(int z = x+1; z <= input.length(); z++){
                String sub = input.substring(x,z);
                String subrev = new StringBuilder(sub).reverse().toString();

                if(sub.equals(subrev)){
                    count++;
                }
            }

        }

        return count;
    }
}
