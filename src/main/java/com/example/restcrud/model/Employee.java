package com.example.restcrud.model;

import lombok.*;

import java.util.List;
@Data
public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;
    private List<Car> cars;
}
