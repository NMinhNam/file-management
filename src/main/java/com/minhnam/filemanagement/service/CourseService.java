package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCoursesList();

    Course getCourseByCode(String code);

    List<Course> getCoursesByKeyword(String keyword);

    int deleteById(Integer id);
}
