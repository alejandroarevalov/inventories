package org.alava.inventories.products.controller;

import org.alava.inventories.products.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public interface ProductsController {

    @GetMapping(value = "", params = "name")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    List<ProductDTO> getProduct(@RequestParam String name);

    @GetMapping("")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    List<ProductDTO> getAllProducts();

    @PostMapping("")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    ProductDTO createProduct(@RequestBody ProductDTO productDTO);
}
