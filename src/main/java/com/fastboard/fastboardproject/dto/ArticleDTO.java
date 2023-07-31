package com.fastboard.fastboardproject.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public record ArticleDTO(LocalDateTime createAt,
                         String createBt,
                         String title,
                         String content,
                         String hashtag
) {
    public static ArticleDTO of(LocalDateTime createAt, String createBt, String title, String content, String hashtag) {
        return new ArticleDTO(createAt, createBt, title, content, hashtag);
    }
}
