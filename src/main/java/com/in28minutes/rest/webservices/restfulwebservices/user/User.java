package com.in28minutes.rest.webservices.restfulwebservices.user;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public class User {
    private Integer id;


    @NotEmpty(message = "Entered Username cannot be empty.")
    @Min(value = 2, message = "Username should have a min. of 2 characters.")
    @Max(15)
    private String name;

    @Past(message = "Birth date should be in the past!")
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}