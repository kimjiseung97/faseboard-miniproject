package com.fastboard.fastboardproject.controller;

import com.fastboard.fastboardproject.config.SpringSecurityConfig;
import com.fastboard.fastboardproject.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@Import(SpringSecurityConfig.class)
@WebMvcTest(MainController.class)
class MainControllerTest {

    private final MockMvc mvc;

    public MainControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }


    @Test
    void givenRootPath_whenRequestRootPage_thenRedirectToArticlesPage() throws Exception {

        mvc.perform(get("/"))
                .andExpect(status().is3xxRedirection());
    }
}