package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.modules.Department;
import io.zipcoder.persistenceapp.modules.Employee;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;

public class DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeService employeeService;

    public Department getDepartment(Integer id){
        return departmentRepository.findOne(id);
    }

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Department setManager(Long id, Long managerId){
        return null;
    }
}
