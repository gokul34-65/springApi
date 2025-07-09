package com.gokul.studentmodel.controller;

import com.gokul.studentmodel.model.Student;
import com.gokul.studentmodel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
         studentService.addStudent(student);
    }
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PutMapping("student/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping("student/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
