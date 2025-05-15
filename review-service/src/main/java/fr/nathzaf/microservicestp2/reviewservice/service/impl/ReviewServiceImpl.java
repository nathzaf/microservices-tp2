package fr.nathzaf.microservicestp2.reviewservice.service.impl;

import fr.nathzaf.microservicestp2.reviewservice.dto.ReviewDto;
import fr.nathzaf.microservicestp2.reviewservice.model.Review;
import fr.nathzaf.microservicestp2.reviewservice.repository.ReviewRepository;
import fr.nathzaf.microservicestp2.reviewservice.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review findById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review createReview(ReviewDto createReviewRequest) {
        Review review = Review.builder()
                .productId(createReviewRequest.getProductId())
                .author(createReviewRequest.getAuthor())
                .subject(createReviewRequest.getSubject())
                .content(createReviewRequest.getContent())
                .build();
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    @Override
    public List<Review> findByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }
}
