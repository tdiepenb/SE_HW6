package de.uni.koeln.se;

import java.util.Scanner;

public class Player {

    private boolean isComputer;
    private BetMore_Game bet;

    private int x;


    public Player(BetMore_Game bet, boolean isComputer) {
        super();
        this.isComputer = isComputer;
        this.bet = bet;
    }

    public int start() {

        x = bet.Play();
        if (!isComputer) {
            boolean user_selected = false;
            int nrOfRounds = 0;
            Scanner scanner = new Scanner(System.in);
            String input;
            while (!user_selected) {
                if (nrOfRounds < 5) {
                    System.out.println("The card value is: " + x);
                    System.out.println("Do you want to redraw? Enter y for yes or n for no");
                    input = scanner.nextLine();
                    switch(input) {
                        case "yes":
                        case "Yes":
                        case "y":
                            user_selected = false;
                            nrOfRounds++;
                            System.out.println("You have " + (5 - nrOfRounds) + " redraws remaining");
                            x = bet.Play();
                            System.out.println("You card value is: " + x);
                            break;
                        case "no":
                        case "No":
                        case "n":
                            user_selected = true;
                            break;
                        default:
                            System.out.println("Command not recognized. Please enter again");
                            break;
                    }
                }
                else {
                    user_selected = true;
                }
            }
            scanner.close();
        }
        return x;
    }

    public int getX() {
        return x;
    }
}
