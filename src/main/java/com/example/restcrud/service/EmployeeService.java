package com.example.restcrud.service;

import com.example.restcrud.entity.EmployeeEntity;
import com.example.restcrud.mapper.EmployeeMapper;
import com.example.restcrud.model.Employee;
import com.example.restcrud.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeMapper employeeMapper;
    private EmployeeRepository employeeRepository;


    public EmployeeEntity addEmployee(Employee employee) {
        employeeRepository.save(employeeMapper.mapDtoToEntity(employee));
        return employeeMapper.mapDtoToEntity(employee);
    }

    public List<Employee> allEmployees() {
        List<EmployeeEntity> employees = employeeRepository.findAll();
        return employees.stream().map(element -> {
            Employee employee = employeeMapper.mapEntityToDto(element);
            employee.setName(element.getName().toLowerCase());
            return employee;
        }).sorted((y,x) -> y.getAge() - x.getAge()).toList();
    }

    public Employee getIdEmployee(int employeeId) {
        return employeeRepository.findById(employeeId)
                .map(employeeMapper::mapEntityToDto).orElse(null);
    }

    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public List<Employee> updateEmployee(Employee employee) {
        employeeRepository.save(employeeMapper.mapDtoToEntity(employee));
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities.stream().map(employeeMapper::mapEntityToDto).toList();

    }

}
