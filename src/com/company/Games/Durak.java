package com.company.Games;

import com.company.Deck;
import com.company.Hand;

import java.util.ArrayList;

public class Durak {
    private ArrayList<Hand> players;
    private Deck deck;

    public Durak(int pl){
        players = new ArrayList<>(pl + 1);
        deck = new Deck();
        deck.shuffle();
        for (int index = 0; index < 5; index++) {
            players.add(new Hand());
        }

        for (int index = 0; index < 7; index++) {
            for (Hand hand : players) {
                hand.add(Deck.pop());
            }
        }
    }
}
