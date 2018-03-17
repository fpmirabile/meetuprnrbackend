package com.reactnative.model;

public class Card {

    public Card() {

    }

    public Card(long id, String firstName, long age, long friends, long interests, String image) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.friends = friends;
        this.interests = interests;
        this.image = image;
    }

    private long id;
    private String firstName;
    private long age;
    private long friends;
    private long interests;
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getFriends() {
        return friends;
    }

    public void setFriends(long friends) {
        this.friends = friends;
    }

    public long getInterests() {
        return interests;
    }

    public void setInterests(long interests) {
        this.interests = interests;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
