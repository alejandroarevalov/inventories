package org.alava.inventories.mappers;

import org.alava.inventories.dto.ProductDTO;
import org.alava.inventories.model.Product;

public class ProductEntityToDTOMapper {

    public Product toEntity(ProductDTO productDTO) {
        return new Product(
                productDTO.Id(),
                productDTO.name(),
                productDTO.price(),
                productDTO.amount(),
                productDTO.description()
        );
    }

    public ProductDTO toDTO(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getAmount(),
                product.getDescription()
        );
    }

}
