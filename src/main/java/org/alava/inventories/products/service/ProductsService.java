package org.alava.inventories.products.service;

import org.alava.inventories.products.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsService {

    List<ProductDTO> getProductByName(String name);

    List<ProductDTO> getAllProducts();

    ProductDTO createProduct(ProductDTO productDTO);
}
