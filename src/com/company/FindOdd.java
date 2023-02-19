package com.company;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {

        Arrays.sort(a);
        int num = 1;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]==a[i+1]){
                num++;
            }else{
                if (num%2!=0){
                    return a[i];
                }else {
                    num=1;
                }
            }
        }
        return a[a.length-1];
    }
}
