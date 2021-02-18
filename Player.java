package PokerGame;

import java.util.ArrayList;
import java.util.List;

class Players {
    private String name;
    private List<Card> cards = new ArrayList<>();

    Players(String name) {
        this.name = name;
    }

    void giveCard(Card card) {
        cards.add(card);
    }

    List<Card> getCards() {
        return cards;
    }

    String printPlayerCards() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " has the following cards:\n");

        for (Card card : cards) {
            stringBuilder.append(card + "\n");
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}