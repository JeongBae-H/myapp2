package com.test.myapp3.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.myapp3.entity.Student;
import com.test.myapp3.service.StudentService;
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
    @GetMapping("/insertForm")
    public String insertForm(){
        return "insert.html";
    }
    @PostMapping("/insert")
    public String insert(Student student){
        studentService.createStudent(student);
        return "redirect:/students/list"; 
    }
    @GetMapping("/updateForm/{id}")
    public String updateForm(@PathVariable("id") Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "update.html";
    }
    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Student student){
        student.setId(id);
        studentService.updateStudent(student);
        return "redirect:/students/list"; 
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students/list";
    }
}