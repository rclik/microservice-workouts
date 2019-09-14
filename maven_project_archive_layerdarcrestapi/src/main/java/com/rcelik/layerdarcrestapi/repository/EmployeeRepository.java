package com.rcelik.layerdarcrestapi.repository;

import com.rcelik.layerdarcrestapi.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
