package com.company.chapter9;

import java.util.Random;
import java.util.Scanner;

class Game {
    int computer;
    int userInput;
    int noOfGuesses = 0;

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    // Constructor → sirf random number generate karega
    public Game() {
        computer = rand.nextInt(100) + 1;
    }

    // user input lene ke liye
    public void takeUserInput() {
        System.out.print("Enter your number: ");
        userInput = sc.nextInt();
        noOfGuesses++;
    }

    // check karne ke liye
    public boolean isCorrectNumber() {
        if (userInput == computer) {
            System.out.println("🎉 Correct! You guessed it!");
            System.out.println("Total guesses: " + noOfGuesses);
            return true;
        } else if (userInput < computer) {
            System.out.println("📉 Your number is too small");
        } else {
            System.out.println("📈 Your number is too large");
        }
        return false;
    }

    // getter
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // setter
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}
public class quizQuestion {
    public static void main(String[] args) {
        System.out.println("QUIZ QUESTION: Create a class Game, which allows a user to play \"Guess the Number\"\n" +
                "game once. Game should have the following methods:\n" +
                "\n" +
                "1. Constructor to generate the random number\n" +
                "\n" +
                "2. takeUserInput() to take a user input of number\n" +
                "\n" +
                "3. isCorrectNumber() to detect whether the number entered by the user is true\n" +
                "\n" +
                "4. getter and setter for noOfGuesses\n" +
                "\n" +
                "Use properties such as noOfGuesses(int), etc to get this task done!");
        Game g = new Game();

        boolean correct = false;

        while (!correct) {
            g.takeUserInput();
            correct = g.isCorrectNumber();
        }

    }
}
