package fr.nathzaf.microservicestp2.productservice.service.impl;

import fr.nathzaf.microservicestp2.productservice.dto.ProductDto;
import fr.nathzaf.microservicestp2.productservice.model.Product;
import fr.nathzaf.microservicestp2.productservice.repository.ProductRepository;
import fr.nathzaf.microservicestp2.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(ProductDto createProductRequest) {
        Product product = Product.builder()
                .name(createProductRequest.getName())
                .weight(createProductRequest.getWeight())
                .build();
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
