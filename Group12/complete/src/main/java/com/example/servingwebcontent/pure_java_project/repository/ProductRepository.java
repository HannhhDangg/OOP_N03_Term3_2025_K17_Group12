package com.example.servingwebcontent.pure_java_project.repository;

import com.example.servingwebcontent.pure_java_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
