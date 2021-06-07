package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Activities Document")
@Document(collection = "activities")
public class Activities {
    @Id
    private String id;
    private String type;
    private String time;
    private String name;
}
