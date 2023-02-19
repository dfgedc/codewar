package com.company;

import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word){
        word =word.toLowerCase();
        String[] s = word.split("");
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (hashMap.containsKey(s[i])){
                hashMap.put(s[i],1);
            }else{
                hashMap.put(s[i],0);
            }
        }
        String s1 = "";
        for (int i = 0; i < s.length; i++) {
            if (hashMap.get(s[i])==1){
                s1 +=")";
            }else{
                s1+="(";
            }
        }
        return s1;
    }
}
