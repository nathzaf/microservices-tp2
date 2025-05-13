package fr.nathzaf.microservicestp2.reviewservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "review")
public class Review {

    @Id
    private Long id;

    private Long productId;

    private String author;

    private String subject;

    private String content;

}
