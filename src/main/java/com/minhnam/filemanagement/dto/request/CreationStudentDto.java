package com.minhnam.filemanagement.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreationStudentDto {
    private String studentCode;

    private String fullName;

    private String email;

    private String phoneNumber;

    private Date dateOfBirth;

    private Boolean gender;
}
