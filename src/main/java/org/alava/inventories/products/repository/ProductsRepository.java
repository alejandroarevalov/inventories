package org.alava.inventories.products.repository;

import org.alava.inventories.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);
    List<Product> findByNameContainingIgnoreCase(String name);
}
