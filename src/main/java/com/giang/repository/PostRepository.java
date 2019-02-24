package com.giang.repository;

import com.giang.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findById(Integer id);

    @Query("SELECT p FROM Post p WHERE p.postDate >= ?1 AND p.postDate <= ?2")
    List<Post> findAllByTimes(LocalDate from, LocalDate to);
}
