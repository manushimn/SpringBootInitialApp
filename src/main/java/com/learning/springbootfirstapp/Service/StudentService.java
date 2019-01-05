package com.learning.springbootfirstapp.Service;

import com.learning.springbootfirstapp.Dao.StudentDao;
import com.learning.springbootfirstapp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Map<Integer, Student> getStudents(){
        return studentDao.getStudents();
    }

    public Student getStudentById(int sid){
        return studentDao.getStudentById(sid);
    }
}
