package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static boolean validParentheses(String parens)
    {
        //Put code below
        String[] strings = parens.split("");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("(")){
                stack.push(strings[i]);
            }
            if(strings[i].equals(")")){
                if(stack.empty()){
                    return false;
                }
                else if(stack.peek().equals("(")){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
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
            return names[0]+", "+names[1]+" and "+ names[2] +" like this";
        }else {
            return names[0]+", "+names[1]+" and "+ (names.length -2) + " others like this";
        }
    }
    public static String rangeExtraction(int[] arr) {
      /*  String s = ""+arr[0];
        ArrayList<String>
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] -arr[i-1]==1){
                if (num==0){
                    s+=","+arr[i-1];
                }
                num++;
            }else {
                if (num<=2){
                    if (num==0){
                        continue;
                    }
                    if (num ==1){
                        s+=","+arr[i-1];
                    }else{
                        s+=arr[i-2]+","+arr[i-1]+","+arr[i];
                    }
                    num = 0;
                }else{
                    s+=  "-"+(arr[i-1]);
                    num = 0;
                }
            }
        }
        return s;

       */
        ArrayList<String> arrayList = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < arr.length; ) {
            c = 0;
            String start = String.valueOf(arr[i]);
            while (i!=arr.length-1 && arr[i+1]-arr[i]==1){
                c++;
                i++;
            }
            if(c>0){
                if (c>1) start +="-"+(Integer.parseInt(start)+c);
                else i--;
            }
            arrayList.add(start);
            i++;
        }
        return String.join(",",arrayList);
    }
    static String toCamelCase(String s){
        if (s.length()<=1){
            return s;
        }
        String[] a =s.replace('_',' ').replace('-',' ').split(" ");
        String b = a[0].substring(0,1)+a[0].substring(1).toLowerCase();

        for (int i = 1; i < a.length; i++) {
            a[i] = a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase();
            b+=a[i];
        }
        return b;
    }
    public static String hebing(String[] s,String a){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<s.length;i++)
        {
            if (s[i].equals(a)){
                continue;
            }else{
                String d = s[i].substring(0,1).toUpperCase()+s[i].substring(1);
                stringBuffer.append(d);
            }
        }
        return stringBuffer.toString();
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] a = {0,0};
        int b =0;
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            b = numbers[i];
            for (int j = 0;  j < numbers.length ; j++) {
                c = numbers[j];
                if (i==j){
                    continue;
                }else if (b+c==target){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }

            }
        }

        return null; // Do your magic!
    }
}
