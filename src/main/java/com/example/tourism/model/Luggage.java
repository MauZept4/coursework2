package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Luggage Document")
@Document(collection = "luggage")
public class Luggage {
    @Id
    private Tourist tourist;
    private Double weight;
    private Double priceForKg;
}
