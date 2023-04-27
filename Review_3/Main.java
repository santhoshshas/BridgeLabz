package com.Program.Review_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                String sorted = sortString(Integer.toString(i));
                if (stack.contains(sorted)) {
                    list.add(i);
                } else {
                    stack.push(Integer.valueOf(sorted));
                }
            }
        }
        while (!list.isEmpty()) {
            System.out.println(list.removeLast() + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}



