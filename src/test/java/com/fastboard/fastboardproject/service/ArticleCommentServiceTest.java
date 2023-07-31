package com.fastboard.fastboardproject.service;

import com.fastboard.fastboardproject.Repository.ArticleCommentRepository;
import com.fastboard.fastboardproject.Repository.ArticleRepository;
import com.fastboard.fastboardproject.domain.Article;
import com.fastboard.fastboardproject.dto.ArticleCommentDTO;
import com.mysema.commons.lang.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {
    @InjectMocks
    private ArticleCommentService sut;

    @Mock
    private ArticleCommentRepository articleCommentRepository;

    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글 id로 조회하면 해당하는 댓글 리스트를 반환한다")
    @Test
    void givenArticleId_whenSearchingArticleComments_thenReturnsArticleComments(){

        Long articleId = 1L;

        Article.of("title","content","#java");


        given(articleRepository.findById(articleId)).willReturn(Optional.of(
                Article.of("title","content","#java"))
        );

        List<ArticleCommentDTO> articleComments = sut.searchArticleComment(articleId);

        assertThat(articleComments).isNull();

        then(articleRepository).should().findById(articleId);
    }


    @DisplayName("댓글 정보를 입력하면 댓글을 저장한다")
    @Test
    void givenArticleComment_whenSaveComment_thenReturnsArticleComments(){

        Long articleId = 1L;

        Article.of("title","content","#java");


        given(articleRepository.findById(articleId)).willReturn(Optional.of(
                Article.of("title","content","#java"))
        );

        List<ArticleCommentDTO> articleComments = sut.searchArticleComment(articleId);

        assertThat(articleComments).isNull();

        then(articleRepository).should().findById(articleId);
    }
}