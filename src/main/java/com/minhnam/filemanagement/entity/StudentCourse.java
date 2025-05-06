package com.minhnam.filemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCourse {
    private Integer id;

    private Integer studentId;

    private Integer courseId;
}
