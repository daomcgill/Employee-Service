package com.hpe.employeeservice;

import org.springframework.stereotype.Component;

/**
 * EmployeeManager class: This class is responsible for initializing the Employees class.
 **/
@Component
public class EmployeeManager {
    private Employees employees;

    // Constructor to initialize the Employees class with a list of sample employees.
    public EmployeeManager() {
        employees = new Employees();
        employees.getEmployeeList().add(new Employee("1", "First1", "Last1", "Email1", "Title1"));
        employees.getEmployeeList().add(new Employee("2", "First2", "Last2", "Email2", "Title2"));
        employees.getEmployeeList().add(new Employee("3", "First3", "Last3", "Email3", "Title3"));
    }

    // Retrieves the list of all employees.
    public Employees getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}