package com.mahedi.relationdto.repositroy;

import com.mahedi.relationdto.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
