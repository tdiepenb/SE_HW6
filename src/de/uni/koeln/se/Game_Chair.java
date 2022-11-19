package de.uni.koeln.se;

public class Game_Chair {

    Player computer, player_2;
    BetMore_Game bet;


    public Game_Chair() {
        super();
        this.computer = new Player(true);
        this.player_2 = new Player(false);
        this.bet = new BetMore_Game();
    }
}
