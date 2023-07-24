package com.fastboard.fastboardproject.Repository;

import com.fastboard.fastboardproject.domain.Article;
import com.fastboard.fastboardproject.domain.ArticleComment;
import com.fastboard.fastboardproject.domain.QArticle;
import com.fastboard.fastboardproject.domain.QArticleComment;
import com.querydsl.core.types.dsl.DateTimeExpression;
import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface ArticleCommentRepository extends
        JpaRepository<ArticleComment,Long>,
        QuerydslBinderCustomizer<QArticleComment>,
        QuerydslPredicateExecutor<ArticleComment>
{
    @Override
    default  void customize(QuerydslBindings bindings, QArticleComment root){
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.createdBy,root.createdAt,root.content);
        bindings.bind(root.content).first(StringExpression::containsIgnoreCase);
        bindings.bind(root.createdAt).first(DateTimeExpression::eq);
        bindings.bind(root.createdBy).first(StringExpression::containsIgnoreCase);
    }
}
