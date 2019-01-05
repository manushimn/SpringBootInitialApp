package com.learning.springbootfirstapp.Controller;

import com.learning.springbootfirstapp.Entity.Student;
import com.learning.springbootfirstapp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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

    @RequestMapping(value = "/{sid}", method = RequestMethod.DELETE)
    public Student deleteStudentById(@PathVariable int sid){
        return studentService.deleteStudentById(sid);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }
}
