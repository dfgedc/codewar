package com.company;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        // your code goes here

        if(seconds ==0){
            return "Now";
        }
        return "ss";
    }
    public static String whoLikesIt(String... names) {
        //Do your magic here
        if(names.length==0){
            return "no one likes this";
        }else if(names.length==1){
            return names[0]+" likes this";
        }else if(names.length==2){
            return names[0]+" and "+ names[1]+" like this";
        }else if(names.length==3){
            return names[0]+", "+names[1]+" and "+ names[2] +"like this";
        }else {
            return names[0]+", "+names[1]+" and 2 other like this";
        }
    }
}
