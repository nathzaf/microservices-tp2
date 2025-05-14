package fr.nathzaf.microservicestp2.recommendationservice.service;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;

public interface RecommendationService {

    Recommendation getRecommendationByProductId(Long productId);
}
