package com.company;

public class Main {

    public static void main(String[] args) {
	int fibonachi [] = new int [11];
        for (int i = 0; i < 11; i++) {
            fibonachi[i] = 0;
        }
        fibonachi [0] = 1;
        fibonachi [1] = 1;

        for (int i = 2; i < 11; i++) {
            fibonachi [i] = fibonachi[i-1]+fibonachi [i-2];
        }

        for (int i = 0; i < 11; i++) {
            int j=i+1;
            System.out.println("fibonachi " + j +" = " +fibonachi [i]);
        }
    }


}
