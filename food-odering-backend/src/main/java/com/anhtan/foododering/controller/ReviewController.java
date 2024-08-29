package com.anhtan.foododering.controller;

import com.anhtan.foododering.Exception.ReviewException;
import com.anhtan.foododering.Exception.UserException;
import com.anhtan.foododering.model.Review;
import com.anhtan.foododering.model.User;
import com.anhtan.foododering.request.ReviewRequest;
import com.anhtan.foododering.service.ReviewService;
import com.anhtan.foododering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private UserService userService;

    @PostMapping("/review")
    public ResponseEntity<Review> createReview(@RequestBody ReviewRequest review, @RequestHeader("Authorization") String jwt) throws UserException {
        User user =userService.findUserProfileByJwt(jwt);
        Review submitedReview = reviewService.submitReview(review,user);
        return ResponseEntity.ok(submitedReview);
    }



    @DeleteMapping("/delete/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long reviewId) throws ReviewException {
        reviewService.deleteReview(reviewId);
        return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/average-rating")
    public ResponseEntity<Double> calculateAverageRating(@RequestBody List<Review> reviews) {
        double averageRating = reviewService.calculateAverageRating(reviews);
        return new ResponseEntity<>(averageRating, HttpStatus.OK);
    }
}
