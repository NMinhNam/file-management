package com.minhnam.filemanagement.mapper;

import com.minhnam.filemanagement.entity.StudentCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentCourseMapper {

    @Select("SELECT c.name               AS course_name\n" +
            "     , COUNT(sc.student_id) AS total_students\n" +
            "FROM student_course sc\n" +
            "         RIGHT JOIN\n" +
            "     courses c ON sc.course_id = c.id\n" +
            "GROUP BY c.name\n" +
            "ORDER BY Total_Students DESC")
    List<StudentCourse> findAllCoursesWithStudentCount();
}
