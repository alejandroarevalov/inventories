package org.alava.inventories.controller;

import lombok.AllArgsConstructor;
import org.alava.inventories.dto.ProductDTO;
import org.alava.inventories.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {

    private ProductsService productsService;

    @GetMapping("")
    public List<ProductDTO> getProduct(@RequestParam String name) {
        return productsService.getProductByName(name);
    }
}
