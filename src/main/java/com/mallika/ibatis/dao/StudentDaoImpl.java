package com.mallika.ibatis.dao;

import com.mallika.ibatis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private SqlSession session;

    @Override
    public void createStudent(Student student) {
//        session.insert("com.mallika.ibatis.mapper.StudentMapper.createStudent",student);
        session.insert("sql-query.createStudent",student);
    }

    @Override
    public Student getStudentById(Long Id) {
        return (Student) session.selectOne("sql-query.getStudentById",Id);
    }

    @Override
    public List<Student> getAllStudents() {
        return session.selectList("sql-query.getAllStudents");
    }
}
