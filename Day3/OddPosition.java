package com.Program.Day3;

public class OddPosition {
    public static void main(String[] args) {
        int[] odd = {23, 45, 78, 90, 33, 42, 77};
        for (int i = 0; i < odd.length; i = i + 2) {
            System.out.println("odd position elements are:" + odd[i]);
        }
    }
}
