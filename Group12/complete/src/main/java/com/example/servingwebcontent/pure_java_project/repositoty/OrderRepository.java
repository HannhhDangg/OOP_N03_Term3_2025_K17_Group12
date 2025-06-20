package com.example.servingwebcontent.pure_java_project.repository;

import com.example.servingwebcontent.pure_java_project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // Bạn có thể thêm các phương thức truy vấn tùy chỉnh ở đây nếu muốn
}
