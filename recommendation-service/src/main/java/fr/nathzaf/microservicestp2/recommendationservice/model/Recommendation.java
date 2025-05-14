package fr.nathzaf.microservicestp2.recommendationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {

    @Id
    private Long id;

    private Long productId;

    private String author;

    private Integer rate;

    private String content;

}
