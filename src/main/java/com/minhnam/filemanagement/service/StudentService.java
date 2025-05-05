package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.entity.Students;

import java.util.List;

public interface StudentService {
    /**
     * Lấy danh sách sinh viên
     * @return danh sách sinh viên
     */
    List<Students> getStudentsList();
}
