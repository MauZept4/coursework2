package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Trip Document")
@Document(collection = "trip")
public class Trip {
    @Id
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Country country;
    private List<Activities> activitiesList;
}
