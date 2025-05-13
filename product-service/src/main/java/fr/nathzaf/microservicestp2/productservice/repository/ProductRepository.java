package fr.nathzaf.microservicestp2.productservice.repository;

import fr.nathzaf.microservicestp2.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
