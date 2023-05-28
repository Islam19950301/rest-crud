package com.example.restcrud.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class CarEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "stamp")
    private String stamp;
    @Column(name = "class")
    private String clas;
    @Column(name = "year")
    private int year;
    @Column(name = "color")
    private String color;


}
