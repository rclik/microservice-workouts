package com.rcelik.layerdarcrestapi.controller;

import com.rcelik.layerdarcrestapi.entity.Employee;
import com.rcelik.layerdarcrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/tcs/employees")
    public Iterable<Employee> findAllEmployees() {
        return service.getAllEmployees();
    }
}
