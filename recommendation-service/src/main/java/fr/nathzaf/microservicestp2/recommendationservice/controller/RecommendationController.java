package fr.nathzaf.microservicestp2.recommendationservice.controller;

import fr.nathzaf.microservicestp2.recommendationservice.dto.RecommendationDto;
import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;
import fr.nathzaf.microservicestp2.recommendationservice.service.RecommendationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/recommendations")
@AllArgsConstructor
public class RecommendationController {

    private final RecommendationService recommendationService;


    @GetMapping("/product/{productId}")
    public ResponseEntity<List<RecommendationDto>> getRecommendationByProductId(@PathVariable Long productId) {
        List<Recommendation> recommendations = recommendationService.getRecommendationsByProductId(productId);
        List<RecommendationDto> recommendationDtos = recommendations.stream().map(RecommendationDto::mapToDTO).toList();
        return ResponseEntity.ok(recommendationDtos);
    }

    @GetMapping("/product")
    public ResponseEntity<List<RecommendationDto>> getRecommendationByProductIdRequestParam(@RequestParam("productId") Long productId) {
        List<Recommendation> recommendations = recommendationService.getRecommendationsByProductId(productId);
        List<RecommendationDto> recommendationDtos = recommendations.stream().map(RecommendationDto::mapToDTO).toList();
        return ResponseEntity.ok(recommendationDtos);
    }
}
