package com.Program.Day5;

public class VowelOrConsonant {
    static void Check(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
      public static void main(String[] args)
    {
        Check('b');
        Check('u');
    }
}
