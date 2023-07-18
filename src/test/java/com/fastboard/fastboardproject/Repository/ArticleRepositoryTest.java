package com.fastboard.fastboardproject.Repository;

import com.fastboard.fastboardproject.config.JpaConfig;
import com.fastboard.fastboardproject.domain.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("JPA연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class ArticleRepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public ArticleRepositoryTest(@Autowired ArticleRepository articleRepository, @Autowired ArticleCommentRepository articleCommentRepository) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @DisplayName("select 테스트")
    @Test
    void givenTestData_WhenSelecting_theninsert(){
        //given
        Article article = articleRepository.findById(1L).orElseThrow();
        article.setHashtag("#SpringBoot");

        articleRepository.saveAndFlush(article);

        System.out.println("해시태그 : "+articleRepository.findById(1L).orElseThrow().getHashtag());
        //when
        List<Article> articles = articleRepository.findAll();
        //then;
        System.out.println(articles.size());
        assertTrue(articles.size()==123,"사이즈가 123이어야한다");
    }


    


}