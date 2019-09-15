package com.rcelik.layerdarcrestapi.controller;

import com.rcelik.layerdarcrestapi.entity.Employee;
import com.rcelik.layerdarcrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    private final Employee EMPTY_EMPLOYEE = new Employee();

    @Autowired
    private EmployeeService service;

    @GetMapping("/tcs/employees")
    public Iterable<Employee> findAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/tcs/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        Optional<Employee> employee = service.getEmployeeById(id);
        return employee.orElse(EMPTY_EMPLOYEE);
    }

    @PostMapping("/tcs/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(service.addEmployee(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/tcs/employee/{id}}")
    public ResponseEntity<String> deleteEmloyeeById(@PathVariable("id") Long id) {
        Optional<Employee> employee = service.getEmployeeById(id);
        if (employee.isPresent()) {
            service.deleteEmployeeById(id);
            return new ResponseEntity<String>("Employee is deleted", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Employee could not found", HttpStatus.NOT_FOUND);
    }
}
