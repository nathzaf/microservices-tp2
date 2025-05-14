package fr.nathzaf.microservicestp2.recommendationservice.controller;

import fr.nathzaf.microservicestp2.recommendationservice.dto.RecommendationDto;
import fr.nathzaf.microservicestp2.recommendationservice.model.Recommendation;
import fr.nathzaf.microservicestp2.recommendationservice.service.RecommendationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/recommendations")
@AllArgsConstructor
public class RecommendationController {

    private final RecommendationService recommendationService;


    @GetMapping("/product/{productId}")
    public ResponseEntity<RecommendationDto> getRecommendationByProductId(@PathVariable Long productId) {
        Recommendation recommendation = recommendationService.getRecommendationByProductId(productId);
        RecommendationDto recommendationDto = RecommendationDto.mapToDTO(recommendation);
        return ResponseEntity.ok(recommendationDto);
    }

    @GetMapping("/product")
    public ResponseEntity<RecommendationDto> getRecommendationByProductIdRequestParam(@RequestParam("productId") Long productId) {
        Recommendation recommendation = recommendationService.getRecommendationByProductId(productId);
        RecommendationDto recommendationDto = RecommendationDto.mapToDTO(recommendation);
        return ResponseEntity.ok(recommendationDto);
    }
}
