package com.minhnam.filemanagement.controller;

import com.minhnam.filemanagement.dto.request.CreationStudentDto;
import com.minhnam.filemanagement.entity.Student;
import com.minhnam.filemanagement.handler.ApiResponse;
import com.minhnam.filemanagement.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Lấy danh sách sinh viên
     */
    @GetMapping
    public ApiResponse<Object> getAllStudents() {
        return ApiResponse.builder()
                .success(true)
                .message("Success")
                .data(studentService.getAllStudents())
                .build();
    }

    /**
     * Thêm sinh viên mới
     */
    @PostMapping
    public ApiResponse<Object> createNewStudent(@RequestBody CreationStudentDto studentDto) {
        return ApiResponse.builder()
                .success(true)
                .message("Success")
                .data(studentService.createNewStudent(studentDto))
                .build();
    }

    /**
     * Cập nhật thông tin sinh viên
     */
    @PutMapping
    public ResponseEntity<Integer> updateStudent(@RequestParam Integer id, @RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.updateStudent(id, student));
    }

    /**
     * Xóa sinh viên
     */
    @DeleteMapping
    public ResponseEntity<Integer> deleteStudent(@RequestParam Integer id) {
        return ResponseEntity.ok().body(studentService.deleteStudent(id));
    }

    /**
     * Thông tin sinh viên theo student Code
     */
    @GetMapping("/{studentCode}")
    public ApiResponse<Object> getStudentByStudentCode(@PathVariable String studentCode) {
        return ApiResponse.builder()
                .success(true)
                .message("Success")
                .data(studentService.getStudentByStudentCode(studentCode))
                .build();
    }
}
