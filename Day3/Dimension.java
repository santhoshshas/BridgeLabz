package com.Program.Day3;

public class Dimension {
    public static void main(String[] args) {
        int[][][] arr3 = new int[3][4][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.println(arr3[i][j][k]);
                }
            }
        }
    }
}