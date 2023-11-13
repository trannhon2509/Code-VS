package springjpa.learn_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springjpa.learn_jpa.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{
    
}
