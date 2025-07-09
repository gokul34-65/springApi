package com.gokul.studentmodel.repository;

import com.gokul.studentmodel.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
