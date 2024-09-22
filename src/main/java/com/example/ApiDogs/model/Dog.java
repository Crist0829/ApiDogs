package com.example.ApiDogs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dogBreed;
    private int age;
    private String color;
    private String size;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setName(String name) {
        this.name = name;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }


    public String getSize(){
        return this.size;
    }

    public String  getDogBreed(){
        return this.dogBreed;
    }

    public int getAge(){
        return this.age;
    }

    public void setUser(User user){
        this.user = user;
    }

    public long getId(){
        return this.id;
    }

    public User getUser(){
        return this.user;
    }


}