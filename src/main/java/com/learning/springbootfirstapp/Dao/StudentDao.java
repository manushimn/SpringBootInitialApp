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
            }
        };
    }

    public Map<Integer, Student> getStudents(){
        return students;
    }

    public Student getStudentById(int sid){
        return students.get(sid);
    }
}
