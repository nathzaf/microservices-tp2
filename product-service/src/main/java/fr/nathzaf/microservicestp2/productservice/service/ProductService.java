package fr.nathzaf.microservicestp2.productservice.service;

import fr.nathzaf.microservicestp2.productservice.dto.ProductDto;
import fr.nathzaf.microservicestp2.productservice.model.Product;

import java.util.List;

public interface ProductService {

    Product findById(Long id);

    List<Product> findAll();

    Product createProduct(ProductDto createProductRequest);

    void deleteProduct(Long productId);
}
