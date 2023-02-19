package com.company;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something
        int h = seconds/3600;
        int m = seconds/60%60;
        int s = seconds%60;
        String a = "";
        String b = "";
        String c = "";
        if(h<10){
            a= ""+0+h;
        }else{
            a = ""+h;
        }
        if(m<10){
            b= ""+0+m;
        }else{
            b = ""+m;
        }
        if(s<10){
            c= ""+0+s;
        }else{
            c = ""+s;
        }
        return a+":"+b+":"+c;
    }
}
