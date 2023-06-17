package com.mahedi.relationdto.service;

import com.mahedi.relationdto.dto.DepartmentDTO;
import com.mahedi.relationdto.dto.SizeDTO;
import com.mahedi.relationdto.model.Course;
import com.mahedi.relationdto.repositroy.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    public List<DepartmentDTO> getAll(){
        return courseRepository.findAll()
                .stream()
                .map(this:: convertEntityToDto)
                .collect(Collectors.toList());
    }

    private DepartmentDTO convertEntityToDto(Course course){
        DepartmentDTO departmentDTO=modelMapper.map(course,DepartmentDTO.class);
        return  departmentDTO;
    }

    public SizeDTO getsize(){
        SizeDTO sizeDTO=new SizeDTO();
        sizeDTO.setCourseSize(courseRepository.count());
        return  sizeDTO;
    }

}
