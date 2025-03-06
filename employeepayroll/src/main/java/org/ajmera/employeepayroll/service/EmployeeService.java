package org.ajmera.employeepayroll.service;

import org.ajmera.employeepayroll.model.Employee;
import org.ajmera.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() { return repository.findAll(); }
    public Employee getEmployeeById(Long id) { return repository.findById(id).orElse(null); }
    public Employee saveEmployee(Employee emp) { return repository.save(emp); }
    public void deleteEmployee(Long id) { repository.deleteById(id); }
}
