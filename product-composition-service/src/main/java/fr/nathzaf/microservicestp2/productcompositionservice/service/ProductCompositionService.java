package fr.nathzaf.microservicestp2.productcompositionservice.service;

import fr.nathzaf.microservicestp2.productcompositionservice.dto.ProductComposition;

public interface ProductCompositionService {

    ProductComposition createProductComposition(Long productId);
}
