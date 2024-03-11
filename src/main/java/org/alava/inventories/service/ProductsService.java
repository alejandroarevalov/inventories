package org.alava.inventories.service;

import org.alava.inventories.exceptions.NoProductFoundException;
import org.alava.inventories.dto.ProductDTO;
import org.alava.inventories.mappers.ProductEntityToDTOMapper;
import org.alava.inventories.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    private final List<ProductDTO> productsList;
    private final ProductEntityToDTOMapper mapper;
    private final ProductsRepository productsRepository;

    public ProductsService(ProductEntityToDTOMapper mapper, ProductsRepository productsRepository) {
        productsList = new ArrayList<>();
        ProductDTO product1 = new ProductDTO(1L, "Papas margarita", 2500.0, 10, "");
        ProductDTO product2 = new ProductDTO(2L, "Coca-Cola 600 ml", 3000.0, 5, "");
        productsList.add(product1);
        productsList.add(product2);
        this.mapper = mapper;
        this.productsRepository = productsRepository;
    }

    public List<ProductDTO> getProductByName(String name) {
        List<ProductDTO> resultList = productsList.stream()
                .filter(p -> p.name()
                        .toLowerCase()
                        .contains(name.toLowerCase()))
                .toList();
        if (resultList.isEmpty()) {
            throw new NoProductFoundException(name);
        }
        return resultList;
    }
}
