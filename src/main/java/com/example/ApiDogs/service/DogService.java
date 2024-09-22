package com.example.ApiDogs.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiDogs.dto.dogs.CreateDogDto;
import com.example.ApiDogs.model.Dog;
import com.example.ApiDogs.model.User;
import com.example.ApiDogs.repository.DogRepository;

@Service
public class DogService {
    
    @Autowired
    private DogRepository dogRepository;


    public Dog createDog(CreateDogDto dog, User user){
        Dog createdDog = new Dog();
        createdDog.setAge(dog.getAge());
        createdDog.setDogBreed(dog.getDogBreed());
        createdDog.setName(dog.getName());
        createdDog.setColor(dog.getColor());
        createdDog.setSize(dog.getSize());
        createdDog.setUser(user);
        return dogRepository.save(createdDog);
    }


}
