package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.dto.response.StudentCourseResponseDto;

import java.util.List;

public interface StudentCourseService {
    List<StudentCourseResponseDto> getCoursesWithStudentCount();
}
