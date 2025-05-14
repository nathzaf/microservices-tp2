package fr.nathzaf.microservicestp2.recommendationservice.dto;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;

public record RecommendationDto(Long id, Long productId, String author, Integer rate, String content) {

    public static RecommendationDto mapToDTO(Recommendation recommendation) {
        return new RecommendationDto(
                recommendation.getId(),
                recommendation.getProductId(),
                recommendation.getAuthor(),
                recommendation.getRate(),
                recommendation.getContent()
        );
    }
}
