package com.minhnam.filemanagement.controller;

import com.minhnam.filemanagement.entity.StudentCourse;
import com.minhnam.filemanagement.service.StudentCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student-course")
@RequiredArgsConstructor
public class StudentCourseController {

    private final StudentCourseService studentCourseService;

    @GetMapping("/getCoursesWithStudentCount")
    public List<StudentCourse> getCoursesWithStudentCount() {
        return studentCourseService.getCoursesWithStudentCount();
    }
}
