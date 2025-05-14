package fr.nathzaf.microservicestp2.recommendationservice.service.impl;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;
import fr.nathzaf.microservicestp2.recommendationservice.repository.RecommendationRepository;
import fr.nathzaf.microservicestp2.recommendationservice.service.RecommendationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    private final RecommendationRepository recommendationRepository;

    @Override
    public Recommendation getRecommendationByProductId(Long productId) {
        return recommendationRepository.findByProductId(productId);
    }

}
