package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// This Exercise was created to demonstrate how methods work

        //Greet the user
        greetTheUser();

        //ask the user to guess the number
        askUserToGuess();

        //play the game
        playGame();

        //thank the user
        thankTheUser();
    }
    public static void askUserToGuess(){
        System.out.println("Please guess a number: ");
    }
    public static void greetTheUser(){
        System.out.println("Hello, Welcome to the guessing game!!!");
    }
    public static void thankTheUser(){
        System.out.println("Thanks for playing!");
    }
    public static void playGame(){
        //generate number to guess
        int numberToGuess = 47;

        //allows user to guess and validates their guess
        Scanner input = new Scanner(System.in);
        checkUserGuessNumber(input, numberToGuess);

        //Ask User if they would like to play again
        System.out.println("Would you like to play Again? true/false");

        //Ask user to play again
        boolean playAgain = input.nextBoolean();
        if (playAgain == true){
            askUserToGuess();
            playGame();
        }

    }
    public static void checkUserGuessNumber(Scanner input, int numberToGuess){

        int userGuess = input.nextInt();

        if (numberToGuess == userGuess) {
            System.out.println("Congrats! You Win!");
        } else if (userGuess < numberToGuess) {
            System.out.println("Sorry, your number is too low. Guess Again!");
            checkUserGuessNumber(input, numberToGuess);
        } else if (userGuess > numberToGuess) {
            System.out.println("Sorry, your number is too high. Guess Again!");
            checkUserGuessNumber(input, numberToGuess);
        }
    }

}
