package fr.nathzaf.microservicestp2.productcompositionservice.client;

import fr.nathzaf.microservicestp2.productcompositionservice.dto.RecommendationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "recommendation-service")
public interface RecommendationClient {
    @GetMapping("/v1/recommendations")
    List<RecommendationDto> getRecommendationsByProductId(@RequestParam("productId") Long productId);
}
