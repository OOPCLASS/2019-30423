package com.company.classes;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card implements Comparable<Card> {

    private String suit;
    private String number;

    private static final Map<String, Integer> suitsMap = Stream.of(new Object[][] {
            { "clubs", 1 },
            { "diamonds", 2 },
            { "hearts", 3 },
            { "spades", 4},
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    private static final Map<String, Integer> numbersMap = Stream.of(new Object[][] {
            { "2", 1 },
            { "3", 2 },
            { "4", 3 },
            { "5", 4 },
            { "6", 5 },
            { "7", 6 },
            { "8", 7 },
            { "9", 8 },
            { "10", 9 },
            { "J", 10 },
            { "Q", 11 },
            { "K", 12 },
            { "A", 13 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    @Override
    public int compareTo(final Card card) {
        final int currentNumber = numbersMap.get(number);
        final int currentSuit = suitsMap.get(suit);

        final int objectNumber = numbersMap.get(card.number);
        final int objectSuit = suitsMap.get(card.suit);

        if(currentNumber < objectNumber) {
            return 1;
        }
        else if(currentNumber > objectNumber) {
            return -1;
        }
        else {
            if (currentSuit < objectSuit) {
                return 1;
            }
            else if (currentSuit > objectSuit) {
                return -1;
            }
            else return 0;
        }
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
