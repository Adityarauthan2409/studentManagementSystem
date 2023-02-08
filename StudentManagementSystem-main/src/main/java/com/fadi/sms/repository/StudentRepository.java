package com.fadi.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fadi.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
