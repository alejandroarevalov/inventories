package org.alava.inventories.config;

import org.alava.inventories.mappers.ProductEntityToDTOMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SupportConfig {

    @Bean
    public ProductEntityToDTOMapper productEntityToDTOMapper() {
        return new ProductEntityToDTOMapper();
    }
}
