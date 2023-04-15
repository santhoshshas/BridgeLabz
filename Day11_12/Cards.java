package com.Program.Day11_12;

import java.util.Arrays;
import java.util.Random;

public class Cards {
    public static void main(String[] args){
        String[]suits={"cluver","diamonds","hearts","spades"};
        String[]ranks={"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
        int n= suits.length*ranks.length;
        String[] deck=new String[n];
        for(int i=0;i< ranks.length;i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + "of" + suits[j];
            }
        }
        System.out.println("Initial deck of cards");
        System.out.println(Arrays.toString(deck));
        Random rnd = new Random();
        for(int i=n-1;i>0;i--){
            int j=rnd.nextInt(i+1);
            String temp=deck[i];
            deck[i]=deck[j];
            deck[j]=temp;

        }
        System.out.println("Shuffled deck of cards");
        System.out.println(Arrays.toString(deck));
        String[][] players=new String[4][9];
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[i * 9 + j];
            }
        }
        System.out.println("Card received by the 4 players");
        for(int i=0;i<4;i++){
           System.out.println("Player"+(i+1))+":"+Arrays.toString(players[i]));

        }
    }
}
