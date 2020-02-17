package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        int numOfwords = 1;
        for(int x = 0; x <= sentence.length() -1; x++){
            char thiss = sentence.charAt(x);
            if(thiss == ' ' && sentence.charAt(x-1) != ' '){
                numOfwords++;
            }
        }

        String[] intoArr = new String[numOfwords];

        String adder = "";
        int X = 0;
        int lastSPC = 0;
        int pos = 0;

        while(X <= sentence.length() -1){
            if(sentence.charAt(X) == ' '){
                adder = sentence.substring(lastSPC, X++);
                lastSPC = X;
                intoArr[pos] = adder;
                pos++;
            }else if(X == sentence.length() -1){
                adder = sentence.substring(lastSPC, sentence.length());
                intoArr[pos] = adder;
                pos++;
            }
            X++;
        }
        System.out.println(intoArr);

        return intoArr;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        int spaceIndx = 0;
        for(int x = 0; x <= sentence.length() -1; x++){
            if(sentence.charAt(x) == ' '){
                spaceIndx = x;
                break;
            }
        }
        String first = sentence.substring(0,spaceIndx);
        return first;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String first = getFirstWord(sentence);
        String reverse = "";
        for(int x = first.length() -1; x >= 0; x--){
            reverse += first.charAt(x);
        }
        return reverse;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String reversefirst = reverseFirstWord(sentence);
        char camel = reversefirst.charAt(0);
        String cameHolder = "";
        cameHolder += camel;

        return cameHolder.toUpperCase() +reversefirst.substring(1,reversefirst.length()) ;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String removed = "";
        for(int x = 0; x <= str.length() -1; x++){
            if(x == index){

            }else{
                removed += str.charAt(x);
            }
        }
        return removed;
    }

}
