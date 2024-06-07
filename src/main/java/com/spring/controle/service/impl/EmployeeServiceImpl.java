package com.spring.controle.service.impl;

import com.spring.controle.entity.Employee;
import com.spring.controle.repository.StudentRepository;
import com.spring.controle.service.EmployeeService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class EmployeeServiceImpl implements EmployeeService {
    private StudentRepository studentRepository;


    @Override
    public List<Employee> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Employee saveStudent(Employee employee) {
        return studentRepository.save(employee);
    }

    @Override
    public Employee getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Employee updateStudent(Employee employee) {
        return studentRepository.save(employee);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
