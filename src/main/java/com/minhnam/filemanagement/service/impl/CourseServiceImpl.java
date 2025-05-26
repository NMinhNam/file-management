package com.minhnam.filemanagement.service.impl;

import com.minhnam.filemanagement.entity.Course;
import com.minhnam.filemanagement.mapper.CourseMapper;
import com.minhnam.filemanagement.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    // Constructor Injection
    private final CourseMapper courseMapper;

    public CourseServiceImpl(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Override
    public List<Course> getAllCoursesList() {

        /*
        TODO : xử lý logic
         */

        return courseMapper.findAll();
    }

    @Override
    public Course getCourseByCode(String code) {

        /*
        TODO : xử lý logic
         */

        Course course = courseMapper.findByCode(code);

        if (course == null) {
            System.out.println("Course not found");
        }

        return course;
    }

    @Override
    public List<Course> getCoursesByKeyword(String keyword) {

        /*
        TODO : xử lý logic
         */

        List<Course> courseList =  courseMapper.findByKeyword(keyword);
        return courseList;
    }

    @Override
    public int deleteById(Integer id) {

        /*
        TODO : xử lý logic
         */

        return courseMapper.deleteById(id);
    }
}
