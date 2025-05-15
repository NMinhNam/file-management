package com.minhnam.filemanagement.exception;

import com.minhnam.filemanagement.enums.ErrorCode;
import com.minhnam.filemanagement.handler.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ApiResponse<Object>> handleBadSqlGrammarException(BadSqlGrammarException ex) {
        return ResponseEntity.badRequest().body(
                ApiResponse.builder()
                        .success(false)
                        .data(null)
                        .message(ErrorCode.BAD_SQL_EXCEPTION.getMessage())
                        .build()
        );
    }

    @ExceptionHandler
    public ResponseEntity<ApiResponse<Object>> handleAppException(AppException ex) {
        return ResponseEntity.badRequest().body(
                ApiResponse.builder()
                        .success(false)
                        .data(null)
                        .message(ex.getErrorCode().getMessage())
                        .build()
        );
    }
}
