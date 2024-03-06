package com.newSpring.App.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins="*")
@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{year}")
    public List<Student> getHotelsByYear(@PathVariable Long year) {
        return studentService.findByYear(year);
    }
}