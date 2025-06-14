package com.minhnam.filemanagement.service.impl;

import com.minhnam.filemanagement.entity.Course;
import com.minhnam.filemanagement.mapper.CourseMapper;
import com.minhnam.filemanagement.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseMapper courseMapper;

    public CourseServiceImpl(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Override
    public List<Course> getAllCourses() {

        /*
            TODO: xử lý logic
         */

        return courseMapper.findAll();
    }

    @Override
    public int createNewCourse(Course course) {

        /*
            TODO: xử lý logic
         */

        String courseCode = course.getCode(); // JAVA101

        if (courseCode == null || courseCode.isEmpty()) return 0;

        boolean isExistedByCode = courseMapper.isExistedByCode(courseCode); // true

        if (isExistedByCode) {
            System.out.println("Code is exists");
            return 0;
        } else {
            return courseMapper.insertCourse(course);
        }
    }

    @Override
    public int updateCourse(Integer id, Course course) {

        /*
            TODO: xử lý logic
         */

        if (id == null || id > 0) return 0;

        boolean isExistedById = courseMapper.isExistedById(id);

        if (!isExistedById) {
            return 0;
        } else {
            return courseMapper.updateCourse(id, course);
        }
    }

    @Override
    public int deleteCourse(Integer id) {
        return courseMapper.deleteCourse(id);
    }

    @Override
    public List<Course> getCourseByStudentName(String studentName) {

        if(studentName == null || studentName.isEmpty()) {
            return null;
        }

        return courseMapper.findByStudentName(studentName);
    }
}
