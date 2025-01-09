package com.dailycodework.sbdemoapp.controller;

import com.dailycodework.sbdemoapp.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 100, "Some smart phones"),
            new Product(2L, "iphone", 500, "Some smart phones"),
            new Product(3L, "Sneakers", 150, "Some smart shoes"),
            new Product(4L, "Dell", 200, "Some smart laptops"),
            new Product(5L, "HP", 100, "Some laptops")
            );

    @GetMapping("/all")
    public List<Product> getAllProducts() {

        return products;
    }
}
