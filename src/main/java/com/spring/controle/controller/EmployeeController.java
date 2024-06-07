package com.spring.controle.controller;

import com.spring.controle.entity.Employee;
import com.spring.controle.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api")
@Data
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public String listStudents(Model model) {
        model.addAttribute("employees", employeeService.getAllStudents());
        return "employees";
    }

    @GetMapping("/employee/new")
    public String createStudentForm(Model model) {

        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Employee employee) {
        employeeService.saveStudent(employee);
        return "redirect:/employees";
    }


    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        employeeService.deleteStudentById(id);
        return "redirect:/employees";
    }

}