package org.alava.inventories.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.alava.inventories")
public class InventoriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoriesApplication.class, args);
    }

}
