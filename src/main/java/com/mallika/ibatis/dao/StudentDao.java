package com.mallika.ibatis.dao;

import com.mallika.ibatis.model.Student;

import java.util.List;

public interface StudentDao {
    void createStudent(Student student);

    Student getStudentById(Long Id);

    List<Student> getAllStudents();
}
