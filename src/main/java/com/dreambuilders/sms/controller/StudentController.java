package com.dreambuilders.sms.controller;

import com.dreambuilders.sms.model.Student;
import com.dreambuilders.sms.service.StudentService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public ResponseEntity<?> getAllStudents()
    {
        List<Student> studentList = studentService.getAllStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping(value = "/student")
    public ResponseEntity<?> saveStudent(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/student/{studId}")
    public ResponseEntity<?> saveStudent(@PathVariable ObjectId studId)
    {
        studentService.deleteStudent(studId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
