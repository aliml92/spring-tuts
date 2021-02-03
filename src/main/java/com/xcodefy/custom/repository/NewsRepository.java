package com.xcodefy.custom.repository;

import com.xcodefy.custom.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

    @Query("select new News (n.headline) from News n")
    List<News> getNewsHeadlines();
}
