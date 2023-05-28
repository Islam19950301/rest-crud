package com.example.restcrud.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private int age;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.REFRESH
    ,CascadeType.PERSIST})
    @JoinTable(
            name = "employee_cars",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private List<CarEntity> cars;
}
