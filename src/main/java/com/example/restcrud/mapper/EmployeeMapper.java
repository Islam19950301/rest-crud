package com.example.restcrud.mapper;

import com.example.restcrud.entity.EmployeeEntity;
import com.example.restcrud.model.Employee;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeMapper {

    private final ModelMapper mapper;


    public EmployeeEntity mapDtoToEntity(Employee employee) {
        return mapper.map(employee, EmployeeEntity.class);
    }

    public Employee mapEntityToDto(EmployeeEntity employeeEntity) {
        return mapper.map(employeeEntity, Employee.class);
    }


}
