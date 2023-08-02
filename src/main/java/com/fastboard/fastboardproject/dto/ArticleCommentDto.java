package com.fastboard.fastboardproject.dto;

import java.time.LocalDateTime;

public record ArticleCommentDto(
        LocalDateTime createAt,
        String createBy,
        LocalDateTime modifiedBy,
        String content
) {
    public static ArticleCommentDto of(LocalDateTime createAt, String createBy, LocalDateTime modifiedBy, String content) {
        return new ArticleCommentDto(createAt, createBy, modifiedBy, content);
    }
}
