package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String first = "";
        char upper = str.charAt(0);
        String holder = "";
        holder += upper;
        holder.toUpperCase();
        //first += holder;
        first += str.substring(1,str.length());
        return holder.toUpperCase() + first;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";
        for(int x = str.length() - 1; x >= 0; x --){
            char current = str.charAt(x);
            reverse += current;
        }
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String upper = "";
        char camel = str.charAt(str.length() -1);
        upper += camel;

        String reverse = "";
        for(int x = str.length() - 2; x >= 0; x --){
            char current = str.charAt(x);
            reverse += current;
        }
        return upper.toUpperCase() + reverse;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String noFirstOrLast = "";
        for(int x = 1; x <= str.length() -2; x ++){
            char current = str.charAt(x);
            noFirstOrLast += current;
        }
        return noFirstOrLast;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String inverted = "";
        for(int x = 0; x <= str.length() -1; x ++){
            char current = str.charAt(x);
            String holder = "";
            holder += current;
            if(holder.equals(" ")){
                inverted += holder;
            } else if(Character.isUpperCase(current)){
                inverted += holder.toLowerCase();
            }else if(Character.isLowerCase(current)){
                inverted += holder.toUpperCase();
            }
        }
        return inverted;
    }
}
