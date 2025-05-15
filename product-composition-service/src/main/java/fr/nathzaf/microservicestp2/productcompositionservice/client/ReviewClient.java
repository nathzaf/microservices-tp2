package fr.nathzaf.microservicestp2.productcompositionservice.client;

import fr.nathzaf.microservicestp2.productcompositionservice.dto.ReviewDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "reviewservice", url = "${review.service.url}")
public interface ReviewClient {
    @GetMapping("/v1/review/product/{productId}")
    List<ReviewDto> getReviewsByProductId(@PathVariable("productId") Long productId);
}

