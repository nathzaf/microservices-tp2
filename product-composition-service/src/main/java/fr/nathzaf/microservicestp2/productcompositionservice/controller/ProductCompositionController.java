package fr.nathzaf.microservicestp2.productcompositionservice.controller;

import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductComposition;
import fr.nathzaf.microservicestp2.productcompositionservice.service.ProductCompositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products-compositions")
public class ProductCompositionController {

    private final ProductCompositionService productCompositionService;

    public ProductCompositionController(ProductCompositionService productCompositionService) {
        this.productCompositionService = productCompositionService;
    }

    @GetMapping("product/{productId}")
    public ResponseEntity<ProductComposition> getProductComposition(@PathVariable Long productId) {
        ProductComposition productComposition = productCompositionService.createProductComposition(productId);
        return ResponseEntity.ok(productComposition);
    }
}
