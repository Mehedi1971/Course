package com.mahedi.relationdto.controller;

import com.mahedi.relationdto.dto.DepartmentDTO;
import com.mahedi.relationdto.dto.SizeDTO;
import com.mahedi.relationdto.model.Course;
import com.mahedi.relationdto.repositroy.CourseRepository;
import com.mahedi.relationdto.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {
    private final CourseRepository courseRepository;
    private final DepartmentService departmentService;

    @PostMapping("/")
    public Course savcourse(@RequestBody Course course){
      return  courseRepository.save(course);
    }

    @GetMapping("/")
    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    @GetMapping("/dto")
    public List<DepartmentDTO> getall(){
        return departmentService.getAll();
    }

    @GetMapping("/dto1")
    public SizeDTO getsize(){
        return departmentService.getsize();
    }
}
