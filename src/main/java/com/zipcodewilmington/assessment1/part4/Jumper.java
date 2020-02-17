package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int answer = 0;

        if(k < j){
            answer = k / 1;
        }else if(k == j){
            answer = 1;
        }else if(k > j){
            int remainder = k % j;
            int jump = (k-remainder) / j;
            answer = jump + remainder;
        }

        return answer;
    }
}
