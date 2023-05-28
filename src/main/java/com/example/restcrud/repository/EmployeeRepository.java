package com.example.restcrud.repository;

import com.example.restcrud.entity.EmployeeEntity;
import com.example.restcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
