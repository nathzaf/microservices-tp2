package fr.nathzaf.microservicestp2.productcompositionservice.controller;

import fr.nathzaf.microservicestp2.productcompositionservice.client.ProductClient;
import fr.nathzaf.microservicestp2.productcompositionservice.client.ReviewClient;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductComposition;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductDto;
import fr.nathzaf.microservicestp2.productcompositionservice.dto.ReviewDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products-composition")
public class ProductCompositionController {

    private final ProductClient productClient;

    private final ReviewClient reviewClient;

    public ProductCompositionController(ProductClient productClient, ReviewClient reviewClient) {
        this.productClient = productClient;
        this.reviewClient = reviewClient;
    }

    @GetMapping("product/{productId}")
    public ResponseEntity<ProductComposition> getProductComposition(@PathVariable Long productId) {
        ProductDto product = productClient.getProductById(productId);
        ReviewDto review = reviewClient.getReviewByProductId(productId);
        return ResponseEntity.ok(ProductComposition.builder()
                .name(product.getName())
                .reviewId(review.getId())
                .build());
    }
}
