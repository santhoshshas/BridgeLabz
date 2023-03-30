package com.Program.Day2;

import java.util.Scanner;

public class PalndromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String reverse = " ";
        String n = sc.nextLine();
        int length = n.length();
        for (int i = length - 1; i >= 0; i++)
        {
            reverse = reverse + n.charAt(i);
            if (n.equals(reverse))

                System.out.println("The entered number" + n + "is a palindrome.");
                else
                System.out.println("The entered number" + n + "is not a palindrome.");

        }
    }
}