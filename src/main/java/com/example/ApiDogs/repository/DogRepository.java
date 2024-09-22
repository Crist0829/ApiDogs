package com.example.ApiDogs.repository;

import com.example.ApiDogs.model.Dog;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface DogRepository extends JpaRepository<Dog, Long> {
    List<Dog> findByUserId(Integer userId);

}