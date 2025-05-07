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
    public List<Student> getAllStudents() {
        return studentMapper.findAllStudents();
    }

    @Override
    public int createNewStudent(Student student) {

        /*
            TODO: xử lý logic
         */

        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Integer id, Student student) {

        /*
            TODO: xử lý logic
         */


        student.setId(id);

        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(Integer id) {

        /*
            TODO: xử lý logic
         */

        return studentMapper.deleteStudent(id);
    }
}
