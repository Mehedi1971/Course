package com.mahedi.relationdto.repositroy;

import com.mahedi.relationdto.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
