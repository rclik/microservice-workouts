package com.rcelik.layerdarcrestapi.service;

import com.rcelik.layerdarcrestapi.entity.Employee;
import com.rcelik.layerdarcrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Iterable<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
