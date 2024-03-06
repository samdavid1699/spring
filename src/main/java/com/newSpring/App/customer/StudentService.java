package com.newSpring.App.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
class StudentService {

    private static Map<Long, List<Student>> std = new HashMap<>();



    static {
        std.put(2022L, preparepastBatch());
        std.put(2023L, preparepreviousBatch());
        std.put(2024L, preparelatestBatch());
    }



    private static List<Student> preparepastBatch() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sam", 98L, "CS", "9.8/10"));
        students.add(new Student(2, "David", 78L, "CS", "7.8/10"));
        students.add(new Student(3, "Sneha", 68L, "IT", "6.8/10"));
        students.add(new Student(4, "Raja", 88L, "IT", "8.8/10"));
        return students;
    }

    private static List<Student> preparepreviousBatch() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(5, "Mageth", 61L, "Mech", "6.1/10"));
        students.add(new Student(6, "Sundar", 64L, "Mech", "6.4/10"));
        students.add(new Student(7, "Crescent", 73L, "Civil", "7.3/10"));
        students.add(new Student(8, "King", 84L, "Civil", "8.4/10"));
        return students;
    }

    private static List<Student> preparelatestBatch() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(9, "Robin", 74L, "Aero", "7.4/10"));
        students.add(new Student(10, "Paul", 53L, "Aero", "5.3/10"));
        students.add(new Student(11, "Taj", 87L, "EEE", "8.7/10"));
        students.add(new Student(12,  "Coromandel", 94L, "EEE", "9.4/10"));
        students.add(new Student(13, "Mega", 56L, "ECE", "5.6/10"));
        students.add(new Student(14, "Peter", 66L, "ECE", "6.6/10"));
        students.add(new Student(15, "Baner", 72L, "Mech", "7.2/10"));
        students.add(new Student(16, "Bruce", 58L, "CS", "5.8/10"));
        students.add(new Student(17, "Thor", 72L, "CS", "7.2/10"));


        return students;
    }

    List<Student> findByYear(Long year) {
        return std.get(year);
    }
}