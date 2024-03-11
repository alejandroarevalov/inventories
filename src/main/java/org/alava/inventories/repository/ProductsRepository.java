package org.alava.inventories.repository;

import org.alava.inventories.dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<ProductDTO, Long> {

    List<ProductDTO> findProductDTOByNameContainingIgnoreCase(String name);
}
