package com.minhnam.filemanagement.mapper;

import com.minhnam.filemanagement.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentMapper {

    /**
     * Lấy danh sách tất cả sinh viên từ bảng students
     *
     * @return Danh sách thông tin của tất cả sinh viên
     */
    @Select("SELECT id, \n" +
            "       student_code, \n" +
            "       full_name, \n" +
            "       email, \n" +
            "       phone_number, \n" +
            "       date_of_birth, \n" +
            "       gender\n" +
            "FROM students")
    List<Student> findAllStudents();

    /**
     * Thêm một sinh viên mới vào bảng students
     *
     * @param student Thông tin sinh viên cần thêm
     * @return Số dòng bị ảnh hưởng
     */
    @Insert("INSERT INTO students (student_code, full_name, email, " +
            "phone_number, date_of_birth, gender) " +
            "VALUES (#{student.studentCode}, #{student.fullName}, #{student.email}, " +
            "#{student.phoneNumber}, #{student.dateOfBirth}, #{student.gender})")
    int insertStudent(@Param("student") Student student);

    /**
     * Cập nhật thông tin sinh viên theo thông tin trong đối tượng student
     *
     * @param student Thông tin mới của sinh viên, bao gồm cả id của sinh viên cần cập nhật
     * @return Số dòng bị ảnh hưởng
     */
    @Update("UPDATE students " +
            "SET student_code = #{student.studentCode}, full_name = #{student.fullName}, email = #{student.email}, " +
            "phone_number = #{student.phoneNumber}, date_of_birth = #{student.dateOfBirth}, gender = #{student.gender} " +
            "WHERE id = #{student.id}")
    int updateStudent(@Param("student") Student student);

    /**
     * Xóa một sinh viên khỏi bảng students theo ID
     *
     * @param id ID của sinh viên cần xóa
     * @return Số dòng bị ảnh hưởng
     */
    @Delete("DELETE FROM students WHERE id = #{id}")
    int deleteStudent(@Param("id") Integer id);

    /**
     * Kiểm tra tồn tại sinh viên theo ID
     *
     * @param id ID của sinh viên
     * @return Sinh viên có tồn tại hay không ?
     */
    @Select("SELECT EXISTS(" +
            "SELECT 1 FROM students WHERE id = #{id}" +
            ")")
    boolean isExistedStudentById(@Param("id") Integer id);
}
