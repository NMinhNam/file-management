package com.minhnam.filemanagement.controller;

import com.minhnam.filemanagement.entity.Student;
import com.minhnam.filemanagement.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok().body(studentService.getAllStudents());
    }

    /**
     * Thêm sinh viên mới
     */
    @PostMapping
    public ResponseEntity<Integer> createNewStudent(@RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.createNewStudent(student));
    }

    /**
     * Cập nhật thông tin sinh viên
     */
    @PutMapping
    public ResponseEntity<Integer> updateStudent(@RequestParam Integer id, @RequestBody Student student) {

        try{
            int result = studentService.updateStudent(id, student);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    /**
     * Xóa sinh viên
     */
    @DeleteMapping
    public ResponseEntity<Integer> deleteStudent(@RequestParam Integer id) {
        return ResponseEntity.ok().body(studentService.deleteStudent(id));
    }
}
