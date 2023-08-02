package com.fastboard.fastboardproject.service;

import com.fastboard.fastboardproject.Repository.ArticleCommentRepository;
import com.fastboard.fastboardproject.Repository.ArticleRepository;
import com.fastboard.fastboardproject.dto.ArticleCommentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleCommentService {

    private final ArticleRepository articleRepository;

    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(Long articleId) {
        return List.of();
    }
}
