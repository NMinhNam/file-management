package com.minhnam.filemanagement.service.impl;

import com.minhnam.filemanagement.dto.pageable.PageableResponse;
import com.minhnam.filemanagement.entity.Course;
import com.minhnam.filemanagement.mapper.CourseMapper;
import com.minhnam.filemanagement.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    @Override
    public PageableResponse<Course> getCoursesWithPageable(int page, int size, String keyword, String codeCourse) {
        // Tinh offset
        int offset = (page - 1) * size;

        List<Course> courseList = courseMapper.findCourseByKeyword(size, offset, keyword, codeCourse);

        // Nếu courseList rỗng thì trả về luôn không cần tính totalElements & totalPages
        if (courseList.isEmpty()) {
            return new PageableResponse<>(Collections.emptyList(), 0, 0, page);
        }

        int totalElements = courseMapper.countCourse(keyword, codeCourse);
        int totalPages = (int) Math.ceil((double) totalElements / size);

        return new PageableResponse<>(courseList, totalElements, totalPages, page);
    }
}
