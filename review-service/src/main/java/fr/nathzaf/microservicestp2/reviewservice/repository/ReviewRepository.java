package fr.nathzaf.microservicestp2.reviewservice.repository;

import fr.nathzaf.microservicestp2.reviewservice.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    Review findByProductId(Long productId);
}
