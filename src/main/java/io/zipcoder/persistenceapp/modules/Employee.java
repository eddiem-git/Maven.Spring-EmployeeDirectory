package io.zipcoder.persistenceapp.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    private Integer employeeNum;
    private String firstName;
    private String lastName;
    private String title;
    private Integer phoneNumber;
    private String email;
    private String hireDate;

    @ManyToOne
    private Employee manager;
    private Integer departmentNum;

    public Employee(){

    }

    public Employee(Integer employeeNum, String firstName, String lastName, String title, Integer phoneNumber, String email) {
        this.employeeNum = employeeNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Integer employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Integer getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(Integer departmentNum) {
        this.departmentNum = departmentNum;
    }
}
