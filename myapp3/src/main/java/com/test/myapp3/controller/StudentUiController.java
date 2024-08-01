package com.test.myapp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.test.myapp3.entity.Student;
import com.test.myapp3.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentUiController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String list(Model model){
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "list.html";
    }
}
