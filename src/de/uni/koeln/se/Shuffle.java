package de.uni.koeln.se;

import java.util.Random;

public class Shuffle {

    public Shuffle() {
        super();
    }

    public int pick_card() {
        Random rand = new Random();
        return rand.nextInt(1, 101);
    }

}
