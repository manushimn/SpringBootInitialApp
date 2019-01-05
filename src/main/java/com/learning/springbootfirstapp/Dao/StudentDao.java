package com.learning.springbootfirstapp.Dao;

import com.learning.springbootfirstapp.Entity.Student;

import java.util.Map;

public interface StudentDao {
    Map<Integer, Student> getStudents();

    Student getStudentById(int sid);

    Student deleteStudentById(int sid);

    Student updateStudent(Student updatedStudent);

    Student insertStudent(Student student);
}
