package org.alava.inventories.products.mapper;

import org.alava.inventories.products.dto.ProductDTO;
import org.alava.inventories.products.model.Product;

public class ProductMapper {

    public static Product toEntity(ProductDTO productDTO) {
        return new Product(
                productDTO.Id(),
                productDTO.name(),
                productDTO.price(),
                productDTO.amount(),
                productDTO.description()
        );
    }

    public static ProductDTO toDTO(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getAmount(),
                product.getDescription()
        );
    }

}
