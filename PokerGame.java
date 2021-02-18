package PokerGame;

import java.util.Scanner;

public class PokerGame {
    private static final int NO_OF_PLAYERS = 2;
    private final Players[] players = new Players[NO_OF_PLAYERS];
    private final CardDeck cardDeck = new CardDeck();

    public static void main(String[] args) {
        PokerGame pokerGame = new PokerGame();

        System.out.println("WELCOME TO THE CARD GAME\n");
        System.out.println("Enter the players name below");

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            PokerGame.player[i] = new Players(scan.next());
        }

        PokerGame.CardDeck.shuffle(CardDeck());

        System.out.println(pokerGame.cardDeck);

        PokerGame.dealCards();

        PokerGame.displayCardsForPlayers();
    }


    private void dealCards() {
        for (int i = 0; i < cardDeck.SIZE; i++) {
            players[i % NO_OF_PLAYERS].giveCard(cardDeck.getCard(i));
        }
    }

    private void displayCardsForPlayers() {
        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            System.out.println(players[i].printPlayerCards());
        }
    }
}