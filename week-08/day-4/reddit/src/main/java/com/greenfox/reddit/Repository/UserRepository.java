package com.greenfox.reddit.Repository;

import com.greenfox.reddit.Models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Article, Long> {
}