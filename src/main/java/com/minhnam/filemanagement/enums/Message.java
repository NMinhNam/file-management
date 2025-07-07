package com.minhnam.filemanagement.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Message {

    API_SUCCESS("SUCCESS", "Message trả về khi api đúng"),
    ;

    private final String content;

    private final String description;
}
