package com.mahedi.relationdto;

import com.mahedi.relationdto.model.Course;
import com.mahedi.relationdto.model.Student;
import com.mahedi.relationdto.model.Teacher;
import com.mahedi.relationdto.repositroy.CourseRepository;
import com.mahedi.relationdto.repositroy.StudentRepository;
import com.mahedi.relationdto.repositroy.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class RelationDtoApplication implements CommandLineRunner {

    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;
    private final StudentRepository studentRepository;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(RelationDtoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        Course course=new Course();
//        course.setCourseName("Java");
//        course.setCourseCredit("4");
//
//        Teacher teacher=new Teacher();
//        teacher.setTeacherName("A");
//
//        Student student=new Student();
//        student.setStudentName("B");
//
//        course.setTeachers( List.of(teacher));
//        courseRepository.save(course);
//
//        teacher.setStudents(List.of(student));
//        teacherRepository.save(teacher);
//
//        studentRepository.save(student);
    }
}
