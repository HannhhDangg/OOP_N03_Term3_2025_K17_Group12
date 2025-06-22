package com.example.servingwebcontent.pure_java_project.repository;

import com.example.servingwebcontent.pure_java_project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // Có thể thêm các truy vấn tùy chỉnh nếu cần
    // public Optinal<Customer> findByCustomerId(String customerId);
}
