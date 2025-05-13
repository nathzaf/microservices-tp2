package fr.nathzaf.microservicestp2.productcompositionservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductComposition {

    private String name;

    private Long reviewId;
}
