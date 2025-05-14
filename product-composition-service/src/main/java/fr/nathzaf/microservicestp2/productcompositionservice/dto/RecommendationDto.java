package fr.nathzaf.microservicestp2.productcompositionservice.dto;

public record RecommendationDto(Long id, Long productId, String author, Integer rate, String content) {

}
