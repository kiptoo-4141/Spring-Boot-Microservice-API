package com.kiptoo.employee_service.controller;

import com.kiptoo.employee_service.model.Employee;
import com.kiptoo.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepository.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId){
        return employeeRepository.findByDepartment(departmentId);
    }
}
