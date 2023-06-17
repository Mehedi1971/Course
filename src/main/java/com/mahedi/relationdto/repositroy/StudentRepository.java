package com.mahedi.relationdto.repositroy;

import com.mahedi.relationdto.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
