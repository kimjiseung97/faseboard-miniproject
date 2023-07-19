package com.fastboard.fastboardproject.Repository;

import com.fastboard.fastboardproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ArticleCommentRepository extends JpaRepository<ArticleComment,Long> {
}
