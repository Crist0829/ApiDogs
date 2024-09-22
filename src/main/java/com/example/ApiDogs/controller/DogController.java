package com.example.ApiDogs.controller;

import com.example.ApiDogs.dto.dogs.CreateDogDto;
import com.example.ApiDogs.dto.dogs.ResponseDogDto;
import com.example.ApiDogs.mappers.DogMapper;
import com.example.ApiDogs.model.Dog;
import com.example.ApiDogs.model.User;
import com.example.ApiDogs.repository.DogRepository;
import com.example.ApiDogs.service.DogService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
@Validated
public class DogController {
    @Autowired
    private DogRepository dogRepository;

    @Autowired
    private DogService dogService;

    @GetMapping("/me")
    public List<ResponseDogDto> getMyDogs() {

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    User currentUser = (User) authentication.getPrincipal(); 
    Integer userId = currentUser.getId(); 

    List<Dog> dogs = dogRepository.findByUserId(userId);
    return dogs.stream()
               .map(DogMapper::toDto)
               .toList(); 
    }


    @GetMapping
    public List<ResponseDogDto> getAllDogs(){
        List<Dog> dogs = dogRepository.findAll();
        return dogs.stream().map(DogMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public ResponseDogDto showDog(@PathVariable Long id) {
        Dog dog = dogRepository.findById(id).orElseThrow();
        return DogMapper.toDto(dog);
    }


    @PostMapping
    public ResponseDogDto createDog(@Valid @RequestBody CreateDogDto dog) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User currentUser = (User) authentication.getPrincipal();
        Dog createdDog = dogService.createDog(dog, currentUser);
        return DogMapper.toDto(createdDog); 
    }

   

    @DeleteMapping("/{id}")
    public void deleteDog(@PathVariable Long id) {
        dogRepository.deleteById(id);
    }
}
