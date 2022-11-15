package com.springboot.jvspringbootswaggerclean.service;

import com.springboot.jvspringbootswaggerclean.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
