package com.fastboard.fastboardproject.service;

import com.fastboard.fastboardproject.Repository.ArticleRepository;
import com.fastboard.fastboardproject.domain.Article;
import com.fastboard.fastboardproject.domain.type.SearchType;
import com.fastboard.fastboardproject.dto.ArticleDto;
import com.fastboard.fastboardproject.dto.ArticleUpdateDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {
    @InjectMocks
    private ArticleService sut;
    @Mock
    private ArticleRepository articleRepository;

    @Test
    @DisplayName("게시글을 검색하면 게시글 리스트를 반환한다")
    void givenSearchParam_whenSearchingArticles_thenReturnArticleList() {

//        SearchParameters param = SearchParameters.of(SearchType.TITLE,"search keyword");

        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); //제목 , 본문 ID 닉네임 해시태그

        assertTrue(!articles.isEmpty());
    }


    @Test
    @DisplayName("게시글을 조회하면 게시글을 반환한다")
    void givenId_whenSearchingArticles_thenReturnArticle() {

//        SearchParameters param = SearchParameters.of(SearchType.TITLE,"search keyword");

        ArticleDto article = sut.searchArticle(1L); //제목 , 본문 ID 닉네임 해시태그

    }

    @Test
    @DisplayName("게시글을 정보를 입력하면 게시글을 생성한다")
    void givenArticleInfo_whenSavingArticle_thenSaveArticle() {


        given(articleRepository.save(any(Article.class))).willReturn(null);

        sut.saveArticle(ArticleDto.of(LocalDateTime.now(), "Jiseung", "title", "content", "hashtag"));

        then(articleRepository).should().save(any(Article.class));
    }

    @Test
    @DisplayName("게시글을 ID와 수정정보를 입력하면 게시글을 수정한다")
    void givenArticleModifyInfo_whenSavingArticle_thenUpdateArticle() {


        given(articleRepository.save(any(Article.class))).willReturn(null);

        sut.updateArticle(1L, ArticleUpdateDto.of("title", "content", "hashtag"));

        then(articleRepository).should().save(any(Article.class));
    }


    @Test
    @DisplayName("게시글 ID를 입력하면 게시글을 삭제한다")
    void givenArticleModifyInfo_whenDeleteArticle_thenDeleteArticle() {

        willDoNothing().given(articleRepository).delete(any(Article.class));

        given(articleRepository.save(any(Article.class))).willReturn(null);

        sut.deleteArticle(1L);

        then(articleRepository).should().delete(any(Article.class));
    }
}