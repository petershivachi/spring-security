package com.shivachi.demo.ssd.handler;


import com.shivachi.demo.ssd.model.Student;
import com.shivachi.demo.ssd.repo.StudentRepository;
import lombok.NonNull;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Log
@Service
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    public boolean createStudent(@NonNull String username, String firstname, String lastname){
        AtomicBoolean res = new AtomicBoolean();
        
        studentRepository.findByUserName(username).ifPresentOrElse(user -> {}, () -> {
            AtomicReference<Student> student = new AtomicReference<>(new Student());
            student.get().setUsername(username.trim());
            if(firstname != null && !firstname.isEmpty()){
                student.get().setFirstname(firstname.trim());
            }
            if(lastname != null && !lastname.isEmpty()){
                student.get().setLastname(lastname.trim());
            }

            student.set(studentRepository.save(student.get()));

            res.set(true);
        });

        return res.get();
    }


    public Student getStudentById(@NonNull Long id){
        AtomicReference<Student> res = new AtomicReference<>(new Student());

        studentRepository.findById(id).ifPresentOrElse(student ->{


        }, () -> {} );
    }
}
