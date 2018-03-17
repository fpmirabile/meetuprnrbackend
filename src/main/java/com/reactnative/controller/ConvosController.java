package com.reactnative.controller;

import com.reactnative.model.Convos;
import com.reactnative.service.ConvosService;
import com.reactnative.service.IConvosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/convos")
public class ConvosController {

    private final IConvosService _convosService;

    @Autowired
    public ConvosController(ConvosService convosService) {
        this._convosService = convosService;
    }

    @GetMapping(value = "/chats")
    public List<Convos> getChats(long userId) {
        return this._convosService.getAllChats(userId);
    }

}
