package fr.nathzaf.microservicestp2.reviewservice.dto;

import fr.nathzaf.microservicestp2.reviewservice.model.Review;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReviewDto {

    private Long id;

    private Long productId;

    private String author;

    private String subject;

    private String content;

    public static ReviewDto mapToDTO(Review review) {
        return ReviewDto.builder()
                .id(review.getId())
                .productId(review.getProductId())
                .author(review.getAuthor())
                .subject(review.getSubject())
                .content(review.getContent())
                .build();
    }
}
