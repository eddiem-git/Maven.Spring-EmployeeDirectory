package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.modules.Department;
import io.zipcoder.persistenceapp.modules.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findOne(id);
    }

    public Iterable<Employee> getEmployeesManagedBy (long managerId) {
        return employeeRepository.findEmployeeByManagerId(managerId);
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.delete(id);
    }

    public void deleteEmployees(List<Employee> employees){
        employeeRepository.delete(employees);
    }

    public void deleteEmployeesFromDepartment(long departmentId){
        employeeRepository.deleteEmployeesByDepartmentNum(departmentId);
    }

    public void deleteEmployeesManagedByRemap(long managerId) {
        Employee manager = getEmployee(managerId);

        if (manager != null) {
            Employee nextManager = manager.getManager(); // remap employees to this manager
            Iterable<Employee> employees = getEmployeesManagedBy(managerId);

            for (Employee e: employees) { // loop through, remapping them
                for (Employee ee : employeeRepository.findEmployeeByManagerId(e.getEmployeeNum())) {
                    ee.setManager(nextManager);
                }
                deleteEmployee(e.getEmployeeNum());
            }
            deleteEmployee((int) managerId);
        }
    }
}
