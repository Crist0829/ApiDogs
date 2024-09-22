package com.example.ApiDogs.dto.dogs;

import com.example.ApiDogs.dto.UserDto;

public class ResponseDogDto {
    private Long id;
    private String name;
    private Integer age;
    private String dogBreed;
    private String color;
    private UserDto user;

    public ResponseDogDto(Long id, String name, UserDto user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserDto getUser() {
        return user;
    }

    public Integer getAge() {
        return age;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public String getColor() {
        return color;
    }
}