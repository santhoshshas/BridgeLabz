package com.Program.Day2;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=123456;
        int reverse =0;
        for(;n!=0;n=n/10)
        {
            int remainder=n%10;
            reverse = reverse*10+remainder;
        }
        System.out.println("The reverse of the given number is :" +reverse);
    }
}
