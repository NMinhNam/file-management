package com.minhnam.filemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer id;

    private String name;

    private String code;

    private String description;
}
