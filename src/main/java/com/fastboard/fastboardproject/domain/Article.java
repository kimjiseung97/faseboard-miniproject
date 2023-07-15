package com.fastboard.fastboardproject.domain;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
@ToString
@Table(indexes = )
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
