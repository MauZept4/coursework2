package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Expenses Document")
@Document(collection = "expenses")
public class Expenses {
    @Id
    private String id;
    private Double tickets;
    private Double hotel;
    private Double activities;
    private Double luggage;
    private Double unexpected;
}
