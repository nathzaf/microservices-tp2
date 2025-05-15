package fr.nathzaf.microservicestp2.productcompositionservice.client;

import fr.nathzaf.microservicestp2.productcompositionservice.dto.RecommendationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "recommendationservice", url = "${recommendation.service.url}")
public interface RecommendationClient {
    @GetMapping("/v1/recommendations/product/{productId}")
    List<RecommendationDto> getRecommendationsByProductId(@PathVariable("productId") Long productId);
}
