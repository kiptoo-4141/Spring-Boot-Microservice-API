package com.kiptoo.department_service.controller;

import com.kiptoo.department_service.model.Department;
import com.kiptoo.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department add(@RequestBody Department department){
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
