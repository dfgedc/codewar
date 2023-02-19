package com.company;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] d = new double[n];
        d[0] = s[0];
        d[1] = s[1];
        d[2] = s[2];
        for (int i = 3; i <d.length ; i++) {
            d[i] = d[i-1]+d[i-2]+d[i-3];
        }
        return d;
    }
}
