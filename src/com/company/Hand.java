package com.company;

import com.company.Card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
    private List<Card> cards;


    public Hand() {
        cards = new ArrayList<>(25);
    }

    public void add(Card card) {
        cards.add(card);
    }

    public int size() {
        return cards.size();
    }

    public Iterable<Card> cards() {
        return cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Iterable<Card> reveresed() {
        List<Card> reversed = new ArrayList<>(cards);
        Collections.reverse(reversed);
        return reversed;
    }
}
