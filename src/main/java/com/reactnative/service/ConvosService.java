package com.reactnative.service;

import com.reactnative.model.Convos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConvosService implements IConvosService {

    @Override
    public List<Convos> getAllChats(long userId) {
        return this.getChats();
    }


    private List<Convos> getChats() {
        List<Convos> chats = new ArrayList<>();

        chats.add(new Convos(1, "Diane", "Suspendisse accumsan tortor quis turpis.", "../images/image1.jpeg"));
        chats.add(new Convos(2, "Lois", "Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.", "../images/image2.jpeg"));
        chats.add(new Convos(3, "Mary", "Duis bibendum", "../images/image3.jpeg"));
        chats.add(new Convos(4, "Susan", "Praesent blandit", "../images/image4.jpeg"));
        chats.add(new Convos(5, "Betty", "Mauris enim leo, rhoncus sed, vestibulum, cursus id, turpis", "../images/image5.jpeg"));
        chats.add(new Convos(6, "Deborah", "Aliquam sit amet diam in magna bibendum imperdiet", "../images/image6.jpeg"));
        chats.add(new Convos(7, "Frances", "Phasellus sit amet erat", "../images/image7.jpeg"));
        chats.add(new Convos(8, "Joan", "Vestibulum ante ipsum bilia Curae; Duis faucibus accumsan odio", "../images/image8.jpeg"));
        chats.add(new Convos(9, "Denise", "Aliquam non mauris.", "../images/image9.jpeg"));
        chats.add(new Convos(10, "Rachel", "Nulla ac enim.", "../images/image10.jpeg"));

        return chats;
    }
}
