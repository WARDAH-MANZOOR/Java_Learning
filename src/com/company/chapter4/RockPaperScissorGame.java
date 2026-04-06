package com.company.chapter4;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor:");
        int user = sc.nextInt();

        int computer = rand.nextInt(3);

        System.out.println("Computer chose: " + computer);

        // Draw condition
        if(user == computer){
            System.out.println("Match Draw!");
        }
        // User wins conditions
        else if((user == 0 && computer == 2) ||
                (user == 1 && computer == 0) ||
                (user == 2 && computer == 1)){
            System.out.println("You Win!");
        }
        // Computer wins
        else{
            System.out.println("Computer Wins!");
        }
    }
}
