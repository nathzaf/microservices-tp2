package fr.nathzaf.microservicestp2.recommendationservice.repository;

import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

    List<Recommendation> findByProductId(Long productId);

}
