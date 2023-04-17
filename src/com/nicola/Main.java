package com.nicola;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // method that checks if a number is prime for ex. 3
    static boolean isPrime(int n){
        boolean isItPrime = true;
        if ( n <= 1){
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i <= n/2; i++){
                if ( n % i == 0 ){
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }


    public static void main(String[] args) {
        // write your code here

        /* ----> EXERCISE 1 <-----
        Take an input string from the user (terminal) and print it back out
        all in upper case

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(input.toUpperCase());
        */
        //-------------------------------------------------------------------------
        /*
        EXERCISE 2 ----> program that receives numbers as program arguments and
        prints to console if numbers are even or odd. You might compile and run
        the program via command line or by editing configuration and pass program
        arguments.

        if (args.length > 0){
           for (String arg : args){
               int num = Integer.parseInt(arg);
               if (num % 2 == 0){
                   System.out.println(arg + " is an even number. \n");
               }else {
                   System.out.println(arg + " is an odd number.\n");
               }
           }
        }else{
            System.out.println("No arguments were given to the program.\n");
        }
        */

        //-------------------------------------------------------------------------

        /*
        EXERCISE 3 ---> Write a program that takes an input number from the console
         and prints if number is prime. Create a method to check if number is prime
         then use against the input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number, I will tell you if it is prime :\n");
        int inputNumber = sc.nextInt();
        boolean prime = isPrime(inputNumber);
        if (prime){
            System.out.println(inputNumber + " is prime.\n");
        } else{
            System.out.println(inputNumber + " is not prime.\n");
        }

         */

        /*
        EXERCISE 4 ----> Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
         */

        String[] jokes = {"When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.",
                "Where do we get virgin wool from?\n" +
                        "-\n" +
                        "Ugly sheep.",
                "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!",
                "It has four legs and it can fly, what is it?\n" +
                        "-\n" +
                        "A pair of birds.",
                "Wow, honey, I never thought our son would go that far!\n" +
                        " -\n" +
                        "Yeah, the catapult is really amazing. Go get our daughter!\n",
                "What is the difference between a snowman and a snow woman?\n" +
                        "-\n" +
                        "Snowballs.",
                "A dung beetle goes into a bar and asks, \"Yo, is this stool taken?\"\n",
                "You could view the huge cross on the cover of the Holy Bible as a bigtime spoiler…",
                "I used to breed rabbits. Then I realized they can handle it themselves.",
                "Question on Facebook: “What do you do with the white ball once you drank the mozzarella?”",
        };
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Do you want to hear a joke?\n answer with yes or no\n");
            Random random = new Random();
            int randomNumber = random.nextInt(9);

            String response = sc.nextLine();
            if (response.equals("yes")){
                System.out.println(jokes[randomNumber]);
            }else if(response.equals("no")){
                break;
            } else {
                System.out.println("Only yes or no are valid inputs!");
            }
        }


    }








}
