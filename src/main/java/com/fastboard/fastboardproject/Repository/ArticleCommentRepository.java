package com.fastboard.fastboardproject.Repository;

import com.fastboard.fastboardproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleCommentRepository extends JpaRepository<ArticleComment,Long> {
}
