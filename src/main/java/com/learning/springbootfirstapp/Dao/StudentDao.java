package com.learning.springbootfirstapp.Dao;

import com.learning.springbootfirstapp.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Manushi", "Maths"));
                put(2, new Student(2, "Hasanka", "Physics"));
                put(3, new Student(3, "dfd", "Physidgdgdsgcs"));
                put(4, new Student(4, "Hasfdfanka", "Phydfgdssics"));
                put(5, new Student(5, "Hadfdfdsanka", "Phgsdfgdgysics"));
            }
        };
    }

    public Map<Integer, Student> getStudents(){
        return students;
    }

    public Student getStudentById(int sid){
        return students.get(sid);
    }

    public Student deleteStudentById(int sid) {
        return students.remove(sid);
    }

    public Student updateStudent(Student updatedStudent) {
        students.put(updatedStudent.getSid(), updatedStudent);
        return updatedStudent;

    }

    public Student insertStudent(Student student) {
        students.put(student.getSid(), student);
        return student;
    }
}
