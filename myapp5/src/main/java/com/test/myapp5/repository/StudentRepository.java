package com.test.myapp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myapp5.entity.Student;
// JPA or Spring Data jdbc, JDBC Api
public interface StudentRepository extends JpaRepository<Student, Long>{

}
