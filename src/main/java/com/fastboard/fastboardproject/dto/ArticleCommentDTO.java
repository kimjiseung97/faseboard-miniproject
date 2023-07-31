package com.fastboard.fastboardproject.dto;

import java.time.LocalDateTime;

public record ArticleCommentDTO(
        LocalDateTime createAt,
        String createBy,
        LocalDateTime modifiedBy,
        String content
) {
    public static ArticleCommentDTO of(LocalDateTime createAt, String createBy, LocalDateTime modifiedBy, String content) {
        return new ArticleCommentDTO(createAt, createBy, modifiedBy, content);
    }
}
