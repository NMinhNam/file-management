package com.minhnam.filemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private Integer id;

    private String studentCode;

    private String fullName;

    private String email;

    private String phoneNumber;

    private Date dateOfBirth;

    private Boolean gender;
}
