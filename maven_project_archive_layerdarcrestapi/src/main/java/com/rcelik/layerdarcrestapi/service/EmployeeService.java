package com.rcelik.layerdarcrestapi.service;

import com.rcelik.layerdarcrestapi.entity.Employee;
import com.rcelik.layerdarcrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository injectedRepository) {
        this.repository = injectedRepository;
    }

    public Iterable<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        repository.deleteById(id);
    }
}
