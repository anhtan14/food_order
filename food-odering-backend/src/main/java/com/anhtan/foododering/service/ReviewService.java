package com.anhtan.foododering.service;

import com.anhtan.foododering.Exception.ReviewException;
import com.anhtan.foododering.model.Review;
import com.anhtan.foododering.model.User;
import com.anhtan.foododering.request.ReviewRequest;

import java.util.List;

public interface ReviewService {
    public Review submitReview(ReviewRequest review, User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
