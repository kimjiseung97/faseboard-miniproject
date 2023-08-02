package com.fastboard.fastboardproject.dto;

import java.time.LocalDateTime;

public record ArticleDto(LocalDateTime createAt,
                         String createBt,
                         String title,
                         String content,
                         String hashtag
) {
    public static ArticleDto of(LocalDateTime createAt, String createBt, String title, String content, String hashtag) {
        return new ArticleDto(createAt, createBt, title, content, hashtag);
    }
}
