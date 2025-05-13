package fr.nathzaf.microservicestp2.productcompositionservice.client;

import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productservice", url = "${product.service.url}")
public interface ProductClient {
    @GetMapping("/v1/product/{id}")
    ProductDto getProductById(@PathVariable("id") Long id);
}

