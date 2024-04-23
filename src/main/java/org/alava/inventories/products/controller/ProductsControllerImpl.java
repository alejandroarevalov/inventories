package org.alava.inventories.products.controller;

import lombok.AllArgsConstructor;
import org.alava.inventories.products.dto.ProductDTO;
import org.alava.inventories.products.model.Product;
import org.alava.inventories.products.service.ProductsService;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@AllArgsConstructor
public class ProductsControllerImpl implements ProductsController {

    private ProductsService productsService;

    @Override
    public List<ProductDTO> getProduct(String name) {
        return productsService.getProductByName(name);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productsService.getAllProducts();
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return productsService.createProduct(productDTO);
    }
}
