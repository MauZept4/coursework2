package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Department Document")
@Document(collection = "department")
public class Department {
    @Id
    private String id;
    private String address;
    private String phone;
    private Double rating;
}
