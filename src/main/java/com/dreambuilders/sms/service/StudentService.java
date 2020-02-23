package com.dreambuilders.sms.service;

import com.dreambuilders.sms.model.Student;
import com.dreambuilders.sms.repository.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents()
    {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }
    public void saveStudent(Student student)
    {
        studentRepository.save(student);
    }
    public void deleteStudent(ObjectId stuudId)
    {
        studentRepository.deleteById(stuudId);
    }
}
