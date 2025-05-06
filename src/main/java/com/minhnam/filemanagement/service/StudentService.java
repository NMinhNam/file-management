package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * Lấy danh sách sinh viên
     * @return Danh sách sinh viên
     */
    List<Student> getStudentsList();
}
