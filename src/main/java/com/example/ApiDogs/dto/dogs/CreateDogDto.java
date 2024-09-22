package com.example.ApiDogs.dto.dogs;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CreateDogDto {

    @NotNull(message = "Cannot be null")
    private String name;

    @NotNull(message = "Cannot be null")
    private String color;

    @NotNull(message = "Cannot be null")
    private String dogBreed;

    @NotNull(message = "Cannot be null")
    @Positive(message = "Age must be a positive number")
    private Integer age; // Cambiado a Integer

    @NotNull(message = "Cannot be null")
    private String size;



    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }


}
