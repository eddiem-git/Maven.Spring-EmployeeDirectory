package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.modules.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
