package com.springboot.jvspringbootswaggerclean.controller;

import com.springboot.jvspringbootswaggerclean.model.Product;
import com.springboot.jvspringbootswaggerclean.repository.ProductRepository;
import com.springboot.jvspringbootswaggerclean.service.ProductService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/all")
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product create(String title, BigDecimal price) {
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(price);
        return productRepository.save(product);
    }
}
