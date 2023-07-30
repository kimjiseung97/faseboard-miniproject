package com.fastboard.fastboardproject.service;

import com.fastboard.fastboardproject.Repository.ArticleRepository;
import com.fastboard.fastboardproject.domain.type.SearchType;
import com.fastboard.fastboardproject.dto.ArticleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleService {

    private final ArticleRepository articleRepository;
    @Transactional(readOnly = true)
    public Page<ArticleDTO> searchArticles(SearchType searchType, String searchKeyword) {
        return Page.empty();
    }
    @Transactional(readOnly = true)

    public ArticleDTO searchArticle(long l) {
        return null;
    }
}
