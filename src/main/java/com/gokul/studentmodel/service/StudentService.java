package com.gokul.studentmodel.service;

import com.gokul.studentmodel.model.Student;
import com.gokul.studentmodel.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(int id) {
        try{
            return studentRepository.findById(id).get();
        }
        catch(NoSuchElementException e){
            return null;
        }
    }

    public String updateStudent(int id, Student student) {

        for(Student student1:getStudents()){
            if(student1.getId()==id){
                studentRepository.save(student);
                return "update success";
            }
        }
        return "update fail, id not found!!";
    }


    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
