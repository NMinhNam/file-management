package com.minhnam.filemanagement.converter;

import com.minhnam.filemanagement.dto.request.CreationStudentDto;
import com.minhnam.filemanagement.dto.response.StudentResponseDto;
import com.minhnam.filemanagement.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentConverter {

    public static Student toEntity(CreationStudentDto studentDto) {
        Student student = new Student();
        student.setStudentCode(studentDto.getStudentCode());
        student.setFullName(studentDto.getFullName());
        student.setEmail(studentDto.getEmail());
        student.setPhoneNumber(studentDto.getPhoneNumber());
        student.setDateOfBirth(studentDto.getDateOfBirth());
        student.setGender(studentDto.getGender());

        return student;
    }

    public static List<StudentResponseDto> toDtoList(List<Student> student) {
        List<StudentResponseDto> dtoList = new ArrayList<>();

        for (Student s : student) {
            StudentResponseDto dto = new StudentResponseDto();
            dto.setFullName(s.getFullName());
            dto.setGender(s.getGender());
            dtoList.add(dto);
        }

        return dtoList;
    }

}
