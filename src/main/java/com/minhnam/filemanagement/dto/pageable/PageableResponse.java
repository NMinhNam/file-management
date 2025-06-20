package com.minhnam.filemanagement.dto.pageable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageableResponse {

    // total element
    private int totalElement;
    // total pages
    private int totalPages;

    // current page
    private int currPage;
}
