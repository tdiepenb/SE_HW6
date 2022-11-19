package de.uni.koeln.se;

public class BetMore_Game {


    private Shuffle s;

    public BetMore_Game() {
        super();
        this.s = new Shuffle();

    }

    public int Play() {
        return s.pick_card();
    }


    public Player findWinner(Player system, Player player_2) {
        Player winner;
        if (system.getX()> player_2.getX()) {
            winner = system;
        } else {
            winner = player_2;
        }
        return winner;
    }


}
