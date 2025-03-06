package org.ajmera.employeepayroll.repository;

import org.ajmera.employeepayroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
