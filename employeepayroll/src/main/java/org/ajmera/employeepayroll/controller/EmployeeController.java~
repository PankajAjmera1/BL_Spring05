package org.ajmera.employeepayroll.controller;

import org.ajmera.employeepayroll.model.Employee;
import org.ajmera.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAll() { return service.getAllEmployees(); }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) { return service.getEmployeeById(id); }

    @PostMapping
    public Employee create(@RequestBody Employee emp) { return service.saveEmployee(emp); }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
        emp.setId(id);
        return service.saveEmployee(emp);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteEmployee(id); }
}
