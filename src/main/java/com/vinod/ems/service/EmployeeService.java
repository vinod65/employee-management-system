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

    // Save Employee
    public EmployeEntity saveEmployee(EmployeEntity employee) {
        return employeeRepository.save(employee);
    }

    // Get All Employees
    public List<EmployeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get Employee By Id
    public EmployeEntity getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Update Employee
    public EmployeEntity updateEmployee(EmployeEntity employee) {
        return employeeRepository.save(employee);
    }

    // Delete Employee
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

   
    public double getAverageSalary() {

        List<EmployeEntity> employees = employeeRepository.findAll();

        if (employees.isEmpty()) {
            return 0;
        }

        double totalSalary = 0;

        for (EmployeEntity employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary / employees.size();
    }

}
