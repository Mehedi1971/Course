package com.mahedi.relationdto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String studentName;
//    @OneToOne(cascade = CascadeType.ALL)
//    private Course course;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_teacher_id")
//    private Teacher teacher;
}
