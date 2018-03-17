package com.reactnative.service;

import com.reactnative.model.Card;

import java.util.List;

public interface IDateService {

    public List<Card> getAllCards(long latitude, long longitude);

    public boolean matchCard(long userId);

    public boolean deleteMatch(long userId);
}
