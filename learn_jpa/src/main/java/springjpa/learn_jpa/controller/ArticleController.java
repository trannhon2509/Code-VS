package springjpa.learn_jpa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    
    @GetMapping("/articles")
    public ResponseEntity<?> getArticle(){
        

        return ResponseEntity.ok("Article successfully");
    }
}
