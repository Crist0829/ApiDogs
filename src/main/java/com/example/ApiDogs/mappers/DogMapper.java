package com.example.ApiDogs.mappers;

import com.example.ApiDogs.dto.UserDto;
import com.example.ApiDogs.dto.dogs.ResponseDogDto;
import com.example.ApiDogs.model.Dog;
import com.example.ApiDogs.model.User;

public class DogMapper {
    public static ResponseDogDto toDto(Dog dog) {
        User user = dog.getUser();
        UserDto userDto = new UserDto(user.getId(), user.getFullName());
        return new ResponseDogDto(dog.getId(), dog.getName(), userDto);
    }
}
