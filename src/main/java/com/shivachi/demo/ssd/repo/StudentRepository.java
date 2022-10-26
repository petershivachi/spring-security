package com.shivachi.demo.ssd.repo;

import com.shivachi.demo.ssd.model.Student;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByUserName(@NonNull String  u);
}
