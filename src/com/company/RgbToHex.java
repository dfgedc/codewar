package com.company;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return exchange(r)+exchange(g)+exchange(b);
    }
    public static String exchange(int r){
        if(r >=255){
            return "FF";
        }else if(r<=0){
            return "00";
        }else{
            int b = r%16;
            int c = r/16;
            return ex(c)+ex(b);
        }
    }
    public static String ex(int r){
        if (r ==10){
            return "A";
        }else if(r ==11){
            return "B";
        }else if(r ==12){
            return "C";
        }else if (r==13){
            return "D";
        }else if(r ==14){
            return "E";
        }else if(r==15){
            return "F";
        }else if(r==1){
            return "1";
        }else if(r ==2){
        return "2";
        }else if(r ==3){
            return "3";
        }else if (r==4){
            return "4";
        }else if(r ==5){
            return "5";
        }else if(r==6){
            return "6";
        }else if(r==7){
            return "7";
        }else if(r ==8){
            return "8";
        }else if(r==9){
            return "9";
        }else{
            return "0";
        }
    }
}
