package fr.nathzaf.microservicestp2.productcompositionservice.service.impl;

import fr.nathzaf.microservicestp2.productcompositionservice.client.ProductClient;
import fr.nathzaf.microservicestp2.productcompositionservice.client.RecommendationClient;
import fr.nathzaf.microservicestp2.productcompositionservice.client.ReviewClient;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductComposition;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductDto;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.RecommendationDto;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.ReviewDto;
import fr.nathzaf.microservicestp2.productcompositionservice.service.ProductCompositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCompositionServiceImpl implements ProductCompositionService {

    private final ProductClient productClient;

    private final ReviewClient reviewClient;

    private final RecommendationClient recommendationClient;

    public ProductCompositionServiceImpl(ProductClient productClient, ReviewClient reviewClient, RecommendationClient recommendationClient) {
        this.productClient = productClient;
        this.reviewClient = reviewClient;
        this.recommendationClient = recommendationClient;
    }

    @Override
    public ProductComposition createProductComposition(Long productId) {
        ProductDto product = productClient.getProductById(productId);

        List<ReviewDto> reviews = reviewClient.getReviewsByProductId(productId);

        List<RecommendationDto> recommendations = recommendationClient.getRecommendationsByProductId(productId);

        return ProductComposition.builder()
                .name(product.getName())
                .reviewIds(reviews.stream().map(ReviewDto::getId).toList())
                .recommendationIds(recommendations.stream().map(RecommendationDto::id).toList())
                .build();
    }

}
