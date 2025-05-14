package fr.nathzaf.microservicestp2.recommendationservice;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;
import fr.nathzaf.microservicestp2.recommendationservice.repository.RecommendationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(RecommendationRepository recommendationRepository) {
        recommendationRepository.saveAll(List.of(
                Recommendation.builder().id(31L).productId(1L).author("Nathan").rate(3).content("Moyen").build(),
                Recommendation.builder().id(32L).productId(2L).author("Elodie").rate(5).content("Super").build()
        ));
    }

}
