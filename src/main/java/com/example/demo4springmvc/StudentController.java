package com.example.demo4springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentSevice studentSevice;

   @GetMapping("/students/{studentId}")
    public Student select(@PathVariable int studentId) {
       return studentSevice.getById(studentId);
   }

}
