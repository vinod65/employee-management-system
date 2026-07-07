package com.vinod.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.vinod.ems.entity.EmployeEntity;
import com.vinod.ems.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String dashboard(Model model) {

        model.addAttribute("totalEmployees",
                employeeService.getAllEmployees().size());

        model.addAttribute("totalDepartments", 5);

        model.addAttribute("averageSalary",
                employeeService.getAverageSalary());

        return "dashboard";
    
    }
    
    @GetMapping("/employees")
    public String employees(Model model){

        model.addAttribute("employees",
                employeeService.getAllEmployees());

        return "employees";

    }
    @GetMapping("/add")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new EmployeEntity());
        return "add";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute EmployeEntity employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute EmployeEntity employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
