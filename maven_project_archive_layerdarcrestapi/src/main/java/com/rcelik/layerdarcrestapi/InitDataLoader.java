package com.rcelik.layerdarcrestapi;

import com.rcelik.layerdarcrestapi.entity.Employee;
import com.rcelik.layerdarcrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitDataLoader {

    @Autowired
    private EmployeeRepository repository;

    public void load() {
        createEmployees().forEach(emp -> {
            repository.save(emp);
        });
        System.out.println("Initial list successfully added to database");
    }

    private List<Employee> createEmployees() {
        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("Ali Veli");
        emp1.setAddress("Turkey");
        emp1.setSex("Male");
        list.add(emp1);

        Employee emp2 = new Employee();
        emp2.setName("Martin Fowler");
        emp2.setAddress("England");
        emp2.setSex("Male");
        list.add(emp2);

        Employee emp3 = new Employee();
        emp3.setName("Anna Marry");
        emp3.setAddress("France");
        emp3.setSex("Female");
        list.add(emp3);

        return list;
    }
}
