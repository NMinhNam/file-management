package com.minhnam.filemanagement.service.impl;

import com.minhnam.filemanagement.converter.StudentConverter;
import com.minhnam.filemanagement.dto.request.CreationStudentDto;
import com.minhnam.filemanagement.dto.response.StudentResponseDto;
import com.minhnam.filemanagement.entity.Student;
import com.minhnam.filemanagement.enums.ErrorCode;
import com.minhnam.filemanagement.exception.AppException;
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
    public List<StudentResponseDto> getAllStudents() {

        /*
            TODO: Convert from entity to dto
         */

        List<Student> studentList = studentMapper.findAllStudents();

        // Convert from entity to dto
        List<StudentResponseDto> responseDtoList = StudentConverter.toDtoList(studentList);

        return responseDtoList;
    }

    @Override
    public int createNewStudent(CreationStudentDto studentDto) {

        /*
            TODO: xử lý logic

            TODO: Convert from dto to entity
                or Convert from entity to dto

         */

        // Convert from dto to entity
        Student student = StudentConverter.toEntity(studentDto);

        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Integer id, Student student) {

        /*
            TODO: xử lý logic
         */

        // Check exist student by id -> db
        boolean isExistedStudent = studentMapper.isExistedStudentById(id);

        if (!isExistedStudent) {

            // TODO: xử lý lỗi nghiệp vụ tại đây
            throw new AppException(ErrorCode.STUDENT_NOT_EXISTED);
        }

        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(Integer id) {

        /*
            TODO: xử lý logic
         */

        return studentMapper.deleteStudent(id);
    }

    @Override
    public StudentResponseDto getStudentByStudentCode(String studentCode) {
        Student student = studentMapper.findByStudentCode(studentCode);

        /*
            TODO: xử lý logic
         */

        if (student == null) {
            throw new AppException(ErrorCode.STUDENT_NOT_EXISTED);
        }

        return StudentConverter.toDto(student);
    }

    @Override
    public List<Student> getStudentsWithPageable(int page, int size) {
        // Xử lý logic
        // tính offset dựa vào size được truyền vào
        int offset = (page - 1) * size;
        return studentMapper.findStudentWithPageable(offset, size);
    }
}
