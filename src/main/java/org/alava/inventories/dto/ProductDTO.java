package org.alava.inventories.dto;

import java.io.Serializable;

public record ProductDTO (
        Long Id,
        String name,
        Double price,
        Integer amount,
        String description
) implements Serializable {}
