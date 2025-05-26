package com.minhnam.filemanagement.mapper;

import com.minhnam.filemanagement.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("SELECT id, " +
            "name, " +
            "code, " +
            "description\n" +
            "FROM courses")
    List<Course> findAll();

    @Select("SELECT id, " +
            "name, " +
            "code, " +
            "description\n" +
            "FROM courses\n" +
            "WHERE code = #{code}")
    Course findByCode(@Param("code") String code);

    List<Course> findByKeyword(@Param("keyword") String keyword);

    int deleteById(@Param("id") Integer id);
}
