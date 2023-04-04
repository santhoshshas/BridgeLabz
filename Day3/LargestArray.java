package com.Program.Day3;

public class LargestArray {
    public static void main(String[] args) {
        int[] arr = new int[]{72,85,46,85,54};
        int max =arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];
            System.out.println("The largest element in given array is : "+max);
        }
    }
}
