package com.minhnam.filemanagement.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    BAD_SQL_EXCEPTION("2000", "Lỗi liên quan đến câu lệnh sql. Vui lòng kiểm tra lại câu lệnh sql!"),
    STUDENT_NOT_EXISTED("2001", "Sinh viên không có"),
    ;

    private final String code;

    private final String message;
}
