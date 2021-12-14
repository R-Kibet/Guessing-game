package org.example.CH;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //welcome message//
        System.out.println("Welcome to the factor");
        System.out.println("may i have ur name");

        //scanner use for user input//
        Scanner scanner  = new Scanner (System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        //waiting for user permission to start//
        System.out.println("Lets Start");
        System.out.println("\t1. Yes ");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        //making sure we have permision if not it loops till we do//
        while (beginAnswer !=1) {

            System.out.println("Lets Start");
            System.out.println("\t1. Yes ");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();

        }

        //creation of random numbers//
        Random random = new Random();
        int x = random.nextInt(  30)+ 1;//number generated from 1-30//
        System.out.println("guess");
        int userInput = scanner.nextInt();//saving user input//

        //including the times try //
        int timestry = 0;
        boolean hasWon = false;
        boolean shouldfinish = false;

        while(!shouldfinish){
            timestry++;

            if (timestry < 5){
                if (userInput == x){
                    hasWon = true;
                    shouldfinish = true;

                }else if (userInput > x) {
                    System.out.println("Lower");
                    userInput = scanner.nextInt();
                } else{
                    System.out.println("higher");
                    userInput = scanner.nextInt();

                }

            }else {
                shouldfinish = true;
            }
        }
        if (hasWon){
            System.out.println("congrats " + timestry +  " guess" );
        }else{
            System.out.println("game over");
            System.out.println("Number is " + x);
        }

    }




}
