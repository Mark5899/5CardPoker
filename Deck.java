package PokerGame;

import java.util.Random;

class CardDeck {

    CardDeck() {
        int currentCardIndex = 0;

      int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		for( int i = 0; i < deck.length; i++) deck[i] = i;
		
		for( int i = 0; i < deck.length; i++) 
      {
		
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}	
      }
		for( int i = 0; i < 5; i++) 
      {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);


        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[currentCardIndex++] = new Card(suit, rank);
            }
        }
    }

    Card[] getCards() {
        return cards;
    }

    Card getCard(int index) {
        return cards[index];
    }

    void shuffleDeck() {
        Random rand = new Random();

        for (int i = 0; i < SIZE; i++) {
            int j = rand.nextInt(SIZE);
            swapCards(i, j);
        }
    }

    void swapCards(int i, int j) {
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current Deck:\n");

        for (int i = 0; i < CardDeck.SIZE; i++) {
            stringBuilder.append("Card #" + (i + 1) + ": " + getCard(i) + "\n");
        }

        return stringBuilder.toString();
    }
}