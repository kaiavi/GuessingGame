package com.sample.javachallenge;

import java.util.Random;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        System.out.println("NUMBER GUESSING GAME");
        Random randomNumber = new Random();
        int rN = randomNumber.nextInt(20);
        Scanner uin = new Scanner(System.in);
        int userGuess, count = 0;
        while(true){
            System.out.printf("Enter your %d guess \n", count + 1);
            userGuess = uin.nextInt();
            if (userGuess == rN){
                System.out.printf("Congrats! You got it right in %d attempt \n",count + 1);
                break;
            }
            else if (userGuess > rN) {
                System.out.println("Not the number I was looking for. I might have tried something SMALLER.\n:P ");
            }
            else {
                System.out.println("Not the number I was looking for. I might have tried something BIGGER.\n:P ");
            }
            count ++;

        }
    }
}
