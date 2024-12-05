package com.hpe.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 * EmployeeController class: REST controller class that handles HTTP requests.
 **/
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    /**
     * Handles GET requests to retrieve all employees.
     * URL: <a href="http://localhost:8080/employees">...</a>
     * @return All employees as JSON.
     */
    @GetMapping
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }

    /**
     * Handles POST requests to add a new employee.
     * URL: <a href="http://localhost:8080/employees">...</a>
     * @param employee JSON payload containing employee details.
     * @return Success message if the employee is added.
     */
    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        employeeManager.getEmployees().addEmployee(employee);
        return ResponseEntity.ok("Employee added successfully!");
    }
}