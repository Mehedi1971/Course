package com.mahedi.relationdto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String teacherName;
//    @ManyToOne
//    @JoinColumn(name = "fk_course_id")
//    private Course course;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> students;
}
