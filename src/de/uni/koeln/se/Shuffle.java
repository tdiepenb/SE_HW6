package de.uni.koeln.se;

import java.util.Random;

public class Shuffle {

    int x;

    public Shuffle() {
        super();
    }

    public int pickCard() {
        Random rand = new Random();
        x = rand.nextInt();

        return x;
    }

}
