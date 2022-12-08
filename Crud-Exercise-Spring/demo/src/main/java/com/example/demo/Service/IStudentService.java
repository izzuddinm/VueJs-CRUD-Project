package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Student;

public interface IStudentService {
    public Student insertStudent(Student student);

    public List<Student> getAllStudent();

    public Student updateStudent(int id, Student student);

    public Student deleteStudent(int id);
    
    public Student getStudentbyId(long id);
}
