package com.anhtan.foododering.repository;

import com.anhtan.foododering.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
