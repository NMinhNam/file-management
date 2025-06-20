package com.minhnam.filemanagement.service;

import com.minhnam.filemanagement.dto.request.CreationStudentDto;
import com.minhnam.filemanagement.dto.response.StudentResponseDto;
import com.minhnam.filemanagement.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * Lấy danh sách tất cả sinh viên
     * @return Danh sách sinh viên
     */
    List<StudentResponseDto> getAllStudents();

    /**
     * Thêm sinh viên mới
     * @return Số dòng dữ liệu bị thay đổi
     */
    int createNewStudent(CreationStudentDto studentDto);

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

    /**
     *
     * @param studentCode
     * @return
     */
    StudentResponseDto getStudentByStudentCode(String studentCode);

    List<Student> getStudentsWithPageable(int page, int size);
}
