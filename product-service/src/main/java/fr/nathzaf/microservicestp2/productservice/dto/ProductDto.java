package fr.nathzaf.microservicestp2.productservice.dto;

import fr.nathzaf.microservicestp2.productservice.model.Product;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDto {

    private Long id;

    private String name;

    private int weight;

    public static ProductDto mapToDTO(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .weight(product.getWeight())
                .build();
    }
}
