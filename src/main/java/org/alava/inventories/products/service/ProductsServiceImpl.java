package org.alava.inventories.products.service;

import lombok.AllArgsConstructor;
import org.alava.inventories.products.dto.ProductDTO;
import org.alava.inventories.products.exceptions.NoProductFoundException;
import org.alava.inventories.products.exceptions.ProductAlreadyExistsException;
import org.alava.inventories.products.mapper.ProductMapper;
import org.alava.inventories.products.model.Product;
import org.alava.inventories.products.repository.ProductsRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;

    @Override
    public List<ProductDTO> getProductByName(String name) {
        List<Product> productList = productsRepository.findByNameContainingIgnoreCase(name);
        List<ProductDTO> resultList = mapEntityProductsListToDTO(productList);
        if (resultList.isEmpty()) {
            throw new NoProductFoundException(name);
        }
        return resultList;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> productList = productsRepository.findAll();
        return mapEntityProductsListToDTO(productList);
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Optional<Product> optionalProduct = productsRepository.findByName(productDTO.name());
        if (optionalProduct.isPresent()) {
            throw new ProductAlreadyExistsException(productDTO.name());
        }
        Product product = ProductMapper.toEntity(productDTO);
        product = productsRepository.save(product);
        return ProductMapper.toDTO(product);
    }

    private List<ProductDTO> mapEntityProductsListToDTO(List<Product> productsList) {
        return productsList.stream()
                .map(ProductMapper::toDTO)
                .toList();
    }
}
