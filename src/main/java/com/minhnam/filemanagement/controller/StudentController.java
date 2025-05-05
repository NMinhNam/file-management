package com.minhnam.filemanagement.controller;

import com.minhnam.filemanagement.entity.Students;
import com.minhnam.filemanagement.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping()
    public ResponseEntity<List<Students>> getStudentsList() {
        return ResponseEntity.ok(studentService.getStudentsList());
    }

    /**
     * Thêm sinh viên mới -> CREATE -> POST
     */
    @PostMapping("/hello-1")
    public String createNewStudent() {
        return "Hello World";
    }
}
