package com.reactnative.service;

import com.reactnative.model.Convos;

import java.util.List;

public interface IConvosService {

    public List<Convos> getAllChats(long userId);
}
