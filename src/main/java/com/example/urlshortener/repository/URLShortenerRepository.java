package com.example.urlshortener.repository;

import com.example.urlshortener.entities.URLShortener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface URLShortenerRepository extends JpaRepository<URLShortener, Long> {
    List<URLShortener> findAll();
    List<URLShortener> findByShortUrl(String shortUrl);
}
