package com.minhnam.filemanagement.controller;

import com.minhnam.filemanagement.entity.Course;
import com.minhnam.filemanagement.service.CourseService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    // Constructor Injection
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCoursesList() {
        return courseService.getAllCoursesList();
    }

    @GetMapping("/{code}")
    public Course getCourseByCode(@PathVariable("code") String code) {
        return courseService.getCourseByCode(code);
    }

    @GetMapping("/search")
    public List<Course> getCoursesByKeyWord(@RequestParam("keyword") String keyword) {
        return courseService.getCoursesByKeyword(keyword);
    }

    @DeleteMapping
    public int deleteCourseById(@RequestParam("id") Integer id) {
        return courseService.deleteById(id);
    }
}