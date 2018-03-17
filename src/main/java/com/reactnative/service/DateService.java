package com.reactnative.service;

import com.reactnative.model.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DateService implements IDateService {

    @Override
    public List<Card> getAllCards(long latitude, long longitude) {
        return this.getAllCards();
    }

    @Override
    public boolean matchCard(long userId) {
        return true;
    }

    @Override
    public boolean deleteMatch(long userId) {
        return true;
    }

    private List<Card> getAllCards() {
        List<Card> cards = new ArrayList<>();

        cards.add(new Card(1, "Denise", 21, 9, 38, "../images/image1.jpeg"));
        cards.add(new Card(2, "Cynthia", 27, 16, 49, "../images/image2.jpeg"));
        cards.add(new Card(3, "Maria", 29, 2, 39, "../images/image3.jpeg"));
        cards.add(new Card(4, "Jessica", 20, 18, 50, "../images/image4.jpeg"));
        cards.add(new Card(5, "Julie", 28, 2, 13, "../images/image5.jpeg"));
        cards.add(new Card(6, "Anna", 24, 12, 44, "../images/image6.jpeg"));

        return cards;
    }
}
