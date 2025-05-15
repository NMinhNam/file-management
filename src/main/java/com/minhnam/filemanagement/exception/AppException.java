package com.minhnam.filemanagement.exception;

import com.minhnam.filemanagement.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppException extends RuntimeException {
    private ErrorCode errorCode;
}
