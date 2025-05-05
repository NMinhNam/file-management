package com.minhnam.filemanagement.mapper;

import com.minhnam.filemanagement.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    /**
     * Lấy danh sách tất cả sinh viên từ bảng students
     * @return Lấy danh sách tất cả sinh viên
     */
    @Select("SELECT id, \n" +
            "       student_code, \n" +
            "       full_name, \n" +
            "       email, \n" +
            "       phone_number, \n" +
            "       date_of_birth, \n" +
            "       gender\n" +
            "FROM students")
    List<Students> findAllStudents();
}
