package com.learning.springbootfirstapp.Dao;

import com.learning.springbootfirstapp.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("MongoData")
public class MongoStudentDaoImpl implements StudentDao{
    @Override
    public Map<Integer, Student> getStudents() {
        return new HashMap<Integer, Student>(){
            {
                put(10, new Student(10, "ww", "tt"));
                put(20, new Student(20, "rr", "uu"));
            }
        };

    }

    @Override
    public Student getStudentById(int sid) {
        return null;
    }

    @Override
    public Student deleteStudentById(int sid) {
        return null;
    }

    @Override
    public Student updateStudent(Student updatedStudent) {
        return null;
    }

    @Override
    public Student insertStudent(Student student) {
        return null;
    }
}
