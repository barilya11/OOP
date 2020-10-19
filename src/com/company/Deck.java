package com.company;

import com.company.Card.Card;
import com.company.Card.Face;
import com.company.Card.Suit;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private static ArrayList<Card> cards;
    private static ArrayList<Card> playDeck;

    public Deck() {
        cards = new ArrayList<>(52);
        for (Suit suit : Suit.items) {
            for (Face face : Face.items) {
                cards.add(new Card(suit, face));
            }
        }
        playDeck = new ArrayList<>(cards);
    }

    public void shuffle() {
        playDeck.clear();
        playDeck.addAll(cards);
        Collections.shuffle(playDeck);
    }

    public static Card pop() {
        if (playDeck.isEmpty()) {
            return null;
        }
        return playDeck.remove(0);
    }

    public void push(Card card) {
        playDeck.add(card);
    }

}