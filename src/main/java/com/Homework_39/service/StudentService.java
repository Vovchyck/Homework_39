package com.Homework_39.service;

import com.Homework_39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    public List<Student> findAll(){
        return List.of(
                new Student("Agent P", 5, "Плацентарні"),
                new Student("Яцек",34, "поляк"),
                new Student("Толік", 22, "робочий")
        );
    }

    public Optional<Student> findById(Long id){
        return Optional.of(new Student("John", 20, "2A"));
    }

    public void save(Student student){
        System.out.println(student);
    }
}
