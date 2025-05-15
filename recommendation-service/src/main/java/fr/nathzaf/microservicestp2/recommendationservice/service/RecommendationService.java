package fr.nathzaf.microservicestp2.recommendationservice.service;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;

import java.util.List;

public interface RecommendationService {

    List<Recommendation> getRecommendationsByProductId(Long productId);
}
