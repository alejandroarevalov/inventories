package org.alava.inventories.products.config;

import org.alava.inventories.products.controller.ProductsController;
import org.alava.inventories.products.controller.ProductsControllerImpl;
import org.alava.inventories.products.repository.ProductsRepository;
import org.alava.inventories.products.service.ProductsService;
import org.alava.inventories.products.service.ProductsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class BeanFactory {

    @Bean
    public ProductsController productsController(ProductsService productsService) {
        return new ProductsControllerImpl(productsService);
    }

    @Bean
    public ProductsService productsService(ProductsRepository productsRepository) {
        return new ProductsServiceImpl(productsRepository);
    }
}
