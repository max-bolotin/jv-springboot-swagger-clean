package com.springboot.jvspringbootswaggerclean.service.impl;

import com.springboot.jvspringbootswaggerclean.model.Product;
import com.springboot.jvspringbootswaggerclean.repository.ProductRepository;
import com.springboot.jvspringbootswaggerclean.service.ProductService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
