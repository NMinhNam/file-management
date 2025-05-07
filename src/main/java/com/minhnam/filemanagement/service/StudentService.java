package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * Lấy danh sách sinh viên
     * @return Danh sách sinh viên
     */
    List<Student> getAllStudents();

    /**
     * Thêm sinh viên mới
     * @return Số dòng dữ liệu bị thay đổi
     */
    int createNewStudent(Student student);

    /**
     * Cập nhật thông tin sinh viên
     * @return Số dòng dữ liệu bị thay đổi
     */
    int updateStudent(Integer id, Student student);

    /**
     * Xóa sinh viên
     * @return Số dòng dữ liệu bị thay đổi
     */
    int deleteStudent(Integer id);
}
