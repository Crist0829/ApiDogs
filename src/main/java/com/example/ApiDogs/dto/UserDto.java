package com.example.ApiDogs.dto;

public class UserDto {
    
    private Integer id;
    private String name;

    public UserDto(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}