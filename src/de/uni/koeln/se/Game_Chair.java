package de.uni.koeln.se;

public class Game_Chair {

    private Player computer, player_2;
    private BetMore_Game bet;


    public Game_Chair() {
        super();
        this.bet = new BetMore_Game();
        this.computer = new Player(bet, true);
        this.player_2 = new Player(bet, false);

        computer.start();
        System.out.println("The Computer picked his card");
        System.out.println("The player picked: " + player_2.start());
        if (bet.findWinner(computer, player_2)==computer) {
            System.out.println("The Winner is the Computer");
        } else {
            System.out.println("The Winner is the Player");
        }

    }
}
