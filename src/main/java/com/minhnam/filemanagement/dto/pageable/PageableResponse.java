package com.minhnam.filemanagement.dto.pageable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageableResponse<T> {

    private List<T> contents;

    // total element
    private int totalElement;

    // total pages
    private int totalPages;

    // current page
    private int currPage;
}
