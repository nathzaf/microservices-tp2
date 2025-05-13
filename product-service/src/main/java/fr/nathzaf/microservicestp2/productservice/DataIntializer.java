package fr.nathzaf.microservicestp2.productservice;

import fr.nathzaf.microservicestp2.productservice.model.Product;
import fr.nathzaf.microservicestp2.productservice.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataIntializer {

    public DataIntializer(ProductRepository productRepository) {
        productRepository.saveAll(List.of(
                Product.builder().id(1L).name("Product 1").weight(10).build(),
                Product.builder().id(2L).name("Product 2").weight(20).build(),
                Product.builder().id(3L).name("Product 3").weight(30).build()
        ));
    }
}
