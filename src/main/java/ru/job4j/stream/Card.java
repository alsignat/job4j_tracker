package ru.job4j.stream;

import java.util.Arrays;

enum Suit {
    Diamonds, Hearts, Spades, Clubs;

}

enum Value {
    V_6, V_7, V_8, V_9, V_10, Jack, Queen, King, Ace;

}

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Arrays.stream(Suit.values())
                .flatMap(s -> Arrays.stream(Value.values())
                        .map(v -> v.name() + " of " + s.name()))
                        .forEach(System.out::println);
    }
}