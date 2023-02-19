package com.company;

import java.util.*;

public class Kata {
    public static String encryptThis(String text) {
        // Implement me! :)
        String[] strings = text.split(" ");
        if(text.length()==0){
            return text;
        }
        for (int i = 0; i < strings.length; i++) {
            int c = strings[i].charAt(0);
            if(strings[i].length()>=3){
                strings[i] = ""+c+ strings[i].substring(strings[i].length()-1)+strings[i].substring(2, strings[i].length()-1)+strings[i].substring(1,2);
            }else if(strings[i].length()==1){
                strings[i] = ""+c;
            }else if(strings[i].length()==2){
                strings[i] =""+c+strings[i].substring(1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int len = a.length;
        int[][]c = new int[len][len];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j]=0;
                for (int k = 0; k < c.length; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public static String sumStrings(String a, String b) {
        String res = "";

        a = new StringBuilder(a).reverse().toString();
        b =  new StringBuilder(b).reverse().toString();
        String[] arr = a.split("");
        String[] arr1 = b.split("");
        int len = 0;

        if(a.length()> b.length()){
            len = b.length();
        }else {
            len = a.length();
        }
        boolean e = false;
        for (int i = 0; i < len; i++) {
            int sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr1[i]);
            if (e == true) {
                sum += 1;
            }
            if (sum > 9) {
                e = true;
            } else {
                e = false;
            }
            res += "" + sum%10;
        }

        if(a.length()>b.length()){
            //int sum = Integer.parseInt(arr[len]);
            for (int i = b.length(); i <a.length() ; i++) {
                int sum = Integer.parseInt(arr[i]) ;
                if (e == true) {
                    sum += 1;
                }
                if (sum > 9) {
                    e = true;
                } else {
                    e = false;
                }
                res += "" + sum%10;
            }
        }
        if (b.length()>a.length()){
            for (int i = a.length(); i <b.length() ; i++) {
                int sum = Integer.parseInt(arr1[i]) ;
                if (e == true) {
                    sum += 1;
                }
                if (sum > 9) {
                    e = true;
                } else {
                    e = false;
                }
                res += "" + sum%10;
            }
        }
        if (e ==true){
            res+="1";
        }
        while (res.charAt(res.length()-1) =='0'){
            res = res.substring(0,res.length()-1);
        }

        return new StringBuilder(res).reverse().toString();

       /*
        if (b.length()>a.length()){
            while (a.length()<b.length()){
                a = "0"+a;
            }
        }else{
            while (a.length()>b.length()){
                b = "0"+b;
            }
        }
        a = new StringBuilder(a).reverse().toString();
        b =  new StringBuilder(b).reverse().toString();
        String[] arr = a.split("");
        String[] arr1 = b.split("");
        String res = "";
        boolean e = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr1[i]);
            if (e == true) {
                sum += 1;
            }
            if (sum > 9) {
                e = true;
            } else {
                e = false;
            }
            res += "" + sum%10;
        }
        if (e ==true){
            res+="1";
        }
        while (res.charAt(res.length()-1) =='0'){
            res = res.substring(0,res.length()-1);
        }
        return new StringBuilder(res).reverse().toString();

       */
    }
    public static String add(String a, String b) {
        String res = "";

        a = new StringBuilder(a).reverse().toString();
        b =  new StringBuilder(b).reverse().toString();
        String[] arr = a.split("");
        String[] arr1 = b.split("");
        int len = 0;

        if(a.length()> b.length()){
            len = b.length();
        }else {
            len = a.length();
        }
        boolean e = false;
        for (int i = 0; i < len; i++) {
            int sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr1[i]);
            if (e == true) {
                sum += 1;
            }
            if (sum > 9) {
                e = true;
            } else {
                e = false;
            }
            res += "" + sum%10;
        }

        if(a.length()>b.length()){
            //int sum = Integer.parseInt(arr[len]);
            for (int i = b.length(); i <a.length() ; i++) {
                int sum = Integer.parseInt(arr[i]) ;
                if (e == true) {
                    sum += 1;
                }
                if (sum > 9) {
                    e = true;
                } else {
                    e = false;
                }
                res += "" + sum%10;
            }
        }
        if (b.length()>a.length()){
            for (int i = a.length(); i <b.length() ; i++) {
                int sum = Integer.parseInt(arr1[i]) ;
                if (e == true) {
                    sum += 1;
                }
                if (sum > 9) {
                    e = true;
                } else {
                    e = false;
                }
                res += "" + sum%10;
            }
        }
        if (e ==true){
            res+="1";
        }
        while (res.charAt(res.length()-1) =='0'){
            res = res.substring(0,res.length()-1);
        }

        return new StringBuilder(res).reverse().toString();
    }

    public static String Factorial(int n) {
        if (n<=0){
            return null;
        }
        int sum = 1;
        while (n!=1){
            sum *=n;
            n--;
        }
        return String.valueOf(sum);
    }
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        return a;
    }
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(numbers[i]);
        }
        stringBuilder.append(") ");
        for (int i = 3;i<10;i++){
            if (i == 5){
                stringBuilder.append(numbers[i]).append("-");
                continue;
            }
            stringBuilder.append(numbers[i]);
        }
        return stringBuilder.toString();
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0)
                sum+=arr[i];
        }
        return sum;
    }
    public static String remove(String str) {
        return str.substring(1,str.length()-1);
        // your code here
    }
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < array.length ; i++) {
            if (array[i]%2!=0) {
                arrayList.add(array[i]);
                array[i] = 1;
            }
        }
        Collections.sort(arrayList);
        int count = 0;
        for (int i = 0;i<array.length;i++) {
            if (array[i]==1) {
                array[i] = arrayList.get(count);
                count++;
            }
        }
        return array;
    }
    public static String high(String s) {
        // Your code here...
        String[] strings = s.split(" ");
        int max = 0;
        String s1 = "";
        for (int i = 0; i <strings.length ; i++) {
            int sum = 0;
            for (int j = 0; j <strings[i].length() ; j++) {
                sum+= strings[i].charAt(j)-96;
            }
            if (sum>max){
                max = sum;
                s1 = strings[i];
            }
        }
        return s1;
    }
    public static int [][] multiplicationTable(int n){
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (j+1)*(i+1);
            }
        }
        return a;
    }
    public static int sortDesc(final int num) {
        //Your code
        return 1;
    }
    public int squareDigits(int n) {
        // TODO Implement me
        String s = "";
        int a = 0;
        int b = 0;
        if (n==0)
            return 0;
        while (n!=0){
            a = n%10;
            b = a*a;
            s = b+s;
            n = n/10;
        }
        return Integer.parseInt(s);
    }
    public static String incrementString(String str) {
        String s = "";
        String s1 ="";
        if (str.length()==0)
            return "1";
        for (int i = str.length()-1; i >0 ; i--) {
            char c = str.charAt(i);
            if (c >=48&c <=57){
                s = ""+c+s;
            }else{
                s1 = str.substring(0,i);
                break;
            }
        }
        long long1 = Long.parseLong(s)+1;

        return ""+s1+long1; // you code here
    }
    public static String[] solution(String s) {
        //Write your code here
        String[] s1;
        if (s.length()%2!=0){
            s1 = new String[s.length()/2+1];
        }else{
            s1 = new String[s.length()/2];
        }
        if (s.length()%2==0){
            for (int i = 0; i < s.length()/2; i++) {
                s1[i] = s.substring(2*i,2*i+2);
            }
        }else {
            for (int i = 0; i < s.length()/2; i++) {
                s1[i] = s.substring(2*i,2*i+2);
            }
            s1[s1.length-1] = s.charAt(s.length()-1)+"_";
        }
        return s1;
    }
    public static char findMissingLetter(char[] array)
    {
        char a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (a+i != array[i]){
                return   (char)(a+i);
            }
        }
        return ' ';
    }
    public static String solution1(String str) {
        // Your code here...
        if(str.length()<=1){
            return str;
        }
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length/2; i++) {
            char c1 = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-i-1] = c1;
        }
        return String.copyValueOf(c);
    }
    public static int duplicateCount(String text) {
        // Write your code here
        text = text.toLowerCase();
        //Arrays.sort(c);
        HashSet<Character> hashSet = new HashSet<>();
        int sum =0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (!hashSet.contains(character)&& text.indexOf(character, i + 1) != -1){
                hashSet.add(character);
            }
        }
        return hashSet.size();
       

    }

    public static String encrypt(final String text, final int n) {
        // Your code here
        return null;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }
}
