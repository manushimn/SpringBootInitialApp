package com.learning.springbootfirstapp.Controller;

import com.learning.springbootfirstapp.Entity.Student;
import com.learning.springbootfirstapp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Map<Integer, Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping(value = "/{sid}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable int sid){
        return studentService.getStudentById(sid);
    }

}
