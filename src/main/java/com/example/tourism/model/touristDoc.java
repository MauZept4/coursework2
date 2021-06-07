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
@Schema(description = "touristDoc Document")
@Document(collection = "touristDoc")
public class touristDoc {
    @Id
    private String id;
    private String passport;
    private String visa;
    private String phoneNumber;
}
