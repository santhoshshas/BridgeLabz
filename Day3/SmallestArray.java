package com.Program.Day3;

public class SmallestArray {
    public static void main(String[] args) {
        int small[] = new int[4];
        small[0] = 100;
        small[1] = 90;
        small[2] = 78;
        small[3] = 67;
        int arr = Integer.MAX_VALUE;
        for (int i = 1; i < small.length; i++) {
            if (small[i] < arr) {
                arr = small[i];


            }
            i++;
        }
        System.out.println("smallest number in array is:" +arr);
    }
}
