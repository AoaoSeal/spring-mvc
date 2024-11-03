package com.example.demo4springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class StudentSevice {

    @Autowired
    private StudentDao studentDao;


    public Student getById(Integer studentId) {
        return studentDao.getById(studentId);
    }
}
