package com.mallika.ibatis.mapper;

import com.mallika.ibatis.model.Student;

import java.util.List;

public interface StudentMapper {
    void createStudent(Student student);

    Student getStudentById(Long Id);

    List<Student> getAllStudents();
}
