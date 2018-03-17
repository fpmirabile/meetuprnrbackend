package com.reactnative.model;

public class Convos {
    private long id;
    private String name;
    private String message;
    private String image;

    public Convos() {

    }

    public Convos(long id, String name, String message, String image) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
