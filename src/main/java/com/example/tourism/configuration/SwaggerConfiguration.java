package com.example.tourism.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI().info(new Info().title("Туристичний клуб")
                                            .version("1.0")
                                            .description("Курсова робота - 2 курс, 2 семестр")
                                            .license(new License().name("Apache 2.0")
                                                                  .url("http://springdoc.org"))
                                            .contact(new Contact().name("Адамчук Михайло")));
    }
}