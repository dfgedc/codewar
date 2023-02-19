package com.company;

public class BitCounting {
    public static int countBits(int n){
        // Show me the code!
        int sum = 0 ;
        while(n!=0){

            if (n%2!=0){
                sum++;
            }
            n = n/2;
        }
        return sum ;
    }

}
