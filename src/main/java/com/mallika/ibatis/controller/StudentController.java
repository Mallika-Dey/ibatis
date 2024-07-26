package com.mallika.ibatis.controller;

import com.mallika.ibatis.dao.StudentDao;
import com.mallika.ibatis.model.Student;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentDao studentDao;

    @PostMapping
    public void create(@RequestBody Student student) {
        studentDao.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentDao.getAllStudents();
    }

    @GetMapping("/{Id}")
    public Student getStudent(@PathVariable Long Id) {
        return studentDao.getStudentById(Id);
    }
}
