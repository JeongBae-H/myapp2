package com.test.myapp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.test.myapp3.entity.Student;
import com.test.myapp3.service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




// Restful Http GET, POST, DELETE, PATCH
@RequestMapping("api/students")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }
    @PostMapping
    public ResponseEntity<Student> creaStudent(@RequestBody Student student) {
        Student savedStudent = studentService.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long Id) {
        Student student = studentService.getStudentById(Id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long Id) {
        studentService.deleteStudent(Id);
        return new ResponseEntity<>("Student deleted", HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long Id, @RequestBody Student student) {
        student.setId(Id);
        Student updatedStudent = studentService.updateStudent(student);
        studentService.updateStudent(student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }
}