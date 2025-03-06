package org.ajmera.employeepayroll.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private String department;
    private double salary;
}
