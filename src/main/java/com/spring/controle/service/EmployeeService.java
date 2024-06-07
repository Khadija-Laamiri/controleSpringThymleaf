package com.spring.controle.service;

import com.spring.controle.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllStudents();

    Employee saveStudent(Employee employee);

    Employee getStudentById(Long id);

    Employee updateStudent(Employee employee);

    void deleteStudentById(Long id);
}
