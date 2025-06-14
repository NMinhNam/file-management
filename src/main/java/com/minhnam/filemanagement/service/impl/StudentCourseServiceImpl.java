package com.minhnam.filemanagement.service.impl;

import com.minhnam.filemanagement.dto.response.StudentCourseResponseDto;
import com.minhnam.filemanagement.entity.StudentCourse;
import com.minhnam.filemanagement.mapper.StudentCourseMapper;
import com.minhnam.filemanagement.service.StudentCourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    private final StudentCourseMapper studentCourseMapper;

    public StudentCourseServiceImpl(StudentCourseMapper studentCourseMapper) {
        this.studentCourseMapper = studentCourseMapper;
    }

    @Override
    public List<StudentCourseResponseDto> getCoursesWithStudentCount() {
        List<StudentCourse> coursesWithStudentCount = studentCourseMapper.findAllCoursesWithStudentCount();

        // Converter
        List<StudentCourseResponseDto> responseDto = new ArrayList<>();

        return responseDto;
    }
}
