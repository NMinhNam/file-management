package com.minhnam.filemanagement.controller;

import com.minhnam.filemanagement.entity.Course;
import com.minhnam.filemanagement.service.CourseService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/createNewCourse")
    public int createNewCourse(@RequestBody Course course) {
        return courseService.createNewCourse(course);
    }

    @DeleteMapping("/deleteCourse")
    public int deleteCourse(@RequestParam Integer id) {
        return courseService.deleteCourse(id);
    }

    @GetMapping("/getCourseByStudentName")
    public List<Course> getCourseByStudentName(@RequestParam String studentName) {
        return courseService.getCourseByStudentName(studentName);
    }
}