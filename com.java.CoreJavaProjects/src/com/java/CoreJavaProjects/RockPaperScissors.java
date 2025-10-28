package com.java.CoreJavaProjects;
import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] options = {"rock", "paper", "scissor"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissor Game:");
        System.out.print("Enter your choice (rock, paper, scissor): ");
        String userChoice = sc.nextLine().toLowerCase();

        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissor")) {
            System.out.println("Wrong input provided. Please select one of: rock, paper, or scissor.");
            return;
        }

        String computerChoice = options[random.nextInt(3)];
        System.out.println("Computer Choice is: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie game!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissor")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissor") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}