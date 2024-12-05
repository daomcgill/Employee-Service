package com.hpe.employeeservice;

import java.util.ArrayList;
import java.util.List;

/**
 * Employees class: This is a resource class that represents a list of employees.
 * This class maintains a list of Employee objects, and supports getting and setting the list.
 * It has the following attributes:
 * - employeeList: a list of Employee objects
 */
public class Employees {
    private List<Employee> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    /**
     * Method to return the list of employees.
     * @return List of employees.
     */
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * Method to set the employee list.
     * @param employeeList List of employees.
     */
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    /**
     * Method to add a new employee to the list.
     * @param employee The employee to be added.
     */
    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}