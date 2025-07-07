package com.minhnam.filemanagement.mapper;

import com.minhnam.filemanagement.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<Course> findAll();

    int insertCourse(@Param("course") Course course);

    int updateCourse(@Param("id") Integer id, @Param("course") Course course);

    int deleteCourse(@Param("id") Integer id);

    boolean isExistedByCode(@Param("code") String code);

    boolean isExistedById(@Param("id") Integer id);

    @Select("SELECT c.id,\n" +
            "       c.name,\n" +
            "       c.code,\n" +
            "       c.description,\n" +
            "       s.full_name\n" +
            "FROM courses c\n" +
            "         LEFT JOIN student_course ON c.id = student_course.course_id\n" +
            "         LEFT JOIN students s ON s.id = student_course.student_id\n" +
            "WHERE s.full_name = #{studentName}")
    List<Course> findByStudentName(@Param("studentName") String studentName);

    List<Course> findCourseByKeyword(@Param("limit") int limit,
                                     @Param("offset") int offset,
                                     @Param("keyword") String keyword,
                                     @Param("codeCourse") String codeCourse);

    int countCourse(@Param("keyword") String keyword,
                    @Param("codeCourse") String codeCourse);
}
