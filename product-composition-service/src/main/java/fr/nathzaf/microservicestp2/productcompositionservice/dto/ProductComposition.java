package fr.nathzaf.microservicestp2.productcompositionservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ProductComposition {

    private String name;

    private List<Long> reviewIds;

    private List<Long> recommendationIds;
}
