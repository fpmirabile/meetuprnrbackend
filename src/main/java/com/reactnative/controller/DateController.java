package com.reactnative.controller;

import com.reactnative.model.Card;
import com.reactnative.service.DateService;
import com.reactnative.service.IDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/dates")
public class DateController {

    private final IDateService _dateService;

    @Autowired
    public DateController(DateService dateService) {
        this._dateService = dateService;
    }

    @GetMapping(value = "/myDates")
    public List<Card> getMyDates(long latitude, long longitude) {
        return this._dateService.getAllCards(latitude, longitude);
    }

    @PostMapping(value = "/match")
    public ResponseEntity<Object> match(long userId) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/noMatch")
    public ResponseEntity<Object> noMatch(long userId) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
