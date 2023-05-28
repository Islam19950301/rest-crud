package com.example.restcrud.controller;

import com.example.restcrud.entity.EmployeeEntity;
import com.example.restcrud.model.Employee;
import com.example.restcrud.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/employees")
    public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        return ResponseEntity.ok(employeeService.allEmployees());
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
        return ResponseEntity.ok(employeeService.getIdEmployee(employeeId));
    }

    @DeleteMapping("/employees")
    public void delete(@RequestParam int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    @PutMapping("employees")
    public ResponseEntity<List<Employee>> update(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.updateEmployee(employee));
    }
}
