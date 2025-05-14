package fr.nathzaf.microservicestp2.recommendationservice.repository;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

    Recommendation findByProductId(Long productId);

}
