package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();

    int createNewCourse(Course course);

    int updateCourse(Integer id, Course course);

    int deleteCourse(Integer id);

    List<Course> getCourseByStudentName(String studentName);
}
