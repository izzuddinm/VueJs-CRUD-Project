package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Model.Student;

public interface IStudentRepository {
    public Student insertStudent(Student student);

    public List<Student> getAllStudent();

    public Student updateStudent(int id, Student student);

    public Student deleteStudent(int id);

    public Student getStudentbyId(long id);
}
