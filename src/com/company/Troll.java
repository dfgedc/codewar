package com.company;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A'
                    ||str.charAt(i)=='a'
                    ||str.charAt(i)=='E'
                    ||str.charAt(i)=='e'
                    ||str.charAt(i)=='I'
                    ||str.charAt(i)=='i'
                    ||str.charAt(i)=='o'
                    ||str.charAt(i)=='O'
                    ||str.charAt(i)=='U'
                    ||str.charAt(i)=='u'){
               continue;
            }else{
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
