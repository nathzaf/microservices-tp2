package fr.nathzaf.microservicestp2.reviewservice.service;

import fr.nathzaf.microservicestp2.reviewservice.dto.ReviewDto;
import fr.nathzaf.microservicestp2.reviewservice.model.Review;

import java.util.List;

public interface ReviewService {

    Review findById(Long id);

    List<Review> findAll();

    Review createReview(ReviewDto createReviewRequest);

    void deleteReview(Long reviewId);

    List<Review> findByProductId(Long productId);
}
