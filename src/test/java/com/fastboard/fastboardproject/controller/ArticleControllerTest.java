package com.fastboard.fastboardproject.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View 컨트롤러 - 게시글")
@WebMvcTest(ArticleController.class)
class ArticleControllerTest {
    private final MockMvc mvc;

    public ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    @DisplayName("[view][GET] 게시글 리스트 {게시판} 페이지 - 정상호출")
    public void givenNothing_whenRequestArticles_thenReturnArticlesview() throws Exception {


        mvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/index"))
                .andExpect(model().attributeExists("articles"));

    }


    @Disabled("구현중")
    @Test
    @DisplayName("[view][GET] 게시글 상세 페이지 - 정상호출")
    public void givenNothing_whenRequestArticles_thenReturnArticlesviewDetail() throws Exception {


        mvc.perform(get("/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/detail"))
                .andExpect(model().attributeExists("articles"))
                .andExpect(model().attributeExists("articleComments"));


    }


    @Test
    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 검색전용 페이지 - 정상호출")
    public void givenNothing_whenRequestArticles_thenReturnArticlesSearchView() throws Exception {


        mvc.perform(get("/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("articles/search"));


    }

    @Test
    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 해시태그검색 페이지 - 정상호출")
    public void givenNothing_whenRequestArticles_thenReturnArticlesHashTagSearchView() throws Exception {


        mvc.perform(get("/articles/search-hashtag"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("article/hashtag"));


    }

}