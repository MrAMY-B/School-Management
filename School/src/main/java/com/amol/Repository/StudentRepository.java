package com.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amol.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
