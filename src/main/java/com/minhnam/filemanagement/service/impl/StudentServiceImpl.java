package com.minhnam.filemanagement.service.impl;

import com.minhnam.filemanagement.entity.Student;
import com.minhnam.filemanagement.mapper.StudentMapper;
import com.minhnam.filemanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> getStudentsList() {
        return studentMapper.findAllStudents();
    }
}
