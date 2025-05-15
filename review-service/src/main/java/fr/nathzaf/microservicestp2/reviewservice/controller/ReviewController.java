package fr.nathzaf.microservicestp2.reviewservice.controller;

import fr.nathzaf.microservicestp2.reviewservice.dto.ReviewDto;
import fr.nathzaf.microservicestp2.reviewservice.model.Review;
import fr.nathzaf.microservicestp2.reviewservice.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewDto> getReviewById(@PathVariable Long id) {
        Review review = reviewService.findById(id);
        if (review == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ReviewDto.mapToDTO(review));
    }

    @GetMapping
    public ResponseEntity<List<ReviewDto>> getReviewsByProductId(@RequestParam("productId") Long productId) {
        List<Review> reviews = reviewService.findByProductId(productId);
        if (reviews == null) {
            return ResponseEntity.notFound().build();
        }
        List<ReviewDto> reviewDtos = reviews.stream().map(ReviewDto::mapToDTO).toList();
        return ResponseEntity.ok(reviewDtos);
    }

    @PostMapping
    public ResponseEntity<ReviewDto> createReview(@RequestBody ReviewDto reviewDto) {
        Review review = reviewService.createReview(reviewDto);
        return ResponseEntity.ok(ReviewDto.mapToDTO(review));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return ResponseEntity.noContent().build();
    }
}
