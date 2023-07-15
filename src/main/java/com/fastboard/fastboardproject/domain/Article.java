package com.fastboard.fastboardproject.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class Article {

    private Long id;

    private String content;
    private String title;

    private String hashTag;


    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
