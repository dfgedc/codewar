package com.company;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
      /*  morseCode = morseCode.trim();
        String[] strings = morseCode.split(" ");
        String s  ="";
        boolean b = false;
        for (int i = 0; i < strings.length; i++) {

            String a = MorseCode.get(strings[i]);
            if(a ==null&& b==false){
               s+=" ";
               b = true;
            }
            if (a==null&&b ==true){
                continue;
            }
            if (a!=null){
                b = false;
            }
            s+=a;
        }
        return s;
        //MorseCode.get

       */
        return null;
    }
    public static String decodeBits(String bits) {
        return ".";
    }

    public static String decodeMorse(String morseCode) {
       // return MorseCode.get(morseCode);
        return null;
    }
}
