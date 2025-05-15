package fr.nathzaf.microservicestp2.reviewservice;

import fr.nathzaf.microservicestp2.reviewservice.model.Review;
import fr.nathzaf.microservicestp2.reviewservice.repository.ReviewRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ReviewRepository reviewRepository) {
        reviewRepository.saveAll(List.of(
                Review.builder().id(21L).productId(1L).author("Nathan").subject("Genial").content("Lorem ipsum").build(),
                Review.builder().id(25L).productId(1L).author("Kim").subject("Super nul").content("Lorem ipsum").build(),
                Review.builder().id(26L).productId(3L).author("Arvinde").subject("Nul").content("Lorem ipsum").build()
        ));
    }
}
