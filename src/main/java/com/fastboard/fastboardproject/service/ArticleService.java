package com.fastboard.fastboardproject.service;

import com.fastboard.fastboardproject.Repository.ArticleRepository;
import com.fastboard.fastboardproject.domain.type.SearchType;
import com.fastboard.fastboardproject.dto.ArticleDto;
import com.fastboard.fastboardproject.dto.ArticleUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleService {

    private final ArticleRepository articleRepository;
    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword) {
        return Page.empty();
    }
    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {

    }

    public void updateArticle(long l, ArticleUpdateDto dto) {
    }

    public void deleteArticle(long ArticleId) {
    }
}
