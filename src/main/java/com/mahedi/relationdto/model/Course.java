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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String courseName;
    private String courseCredit;
    @OneToMany(cascade = CascadeType.ALL)
    List<Teacher> teachers;

}
