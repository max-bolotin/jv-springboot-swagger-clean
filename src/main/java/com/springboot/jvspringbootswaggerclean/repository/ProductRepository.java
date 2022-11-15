package com.springboot.jvspringbootswaggerclean.repository;

import com.springboot.jvspringbootswaggerclean.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    List<Product> findAll();
}
