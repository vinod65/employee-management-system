package com.vinod.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.ems.entity.EmployeEntity;
import com.vinod.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeEntity saveEmployee(EmployeEntity employee) {
        return employeeRepository.save(employee);
    }

    public EmployeEntity getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeEntity updateEmployee(EmployeEntity employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
