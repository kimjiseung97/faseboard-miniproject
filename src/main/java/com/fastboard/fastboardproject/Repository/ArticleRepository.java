package com.fastboard.fastboardproject.Repository;

import com.fastboard.fastboardproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
