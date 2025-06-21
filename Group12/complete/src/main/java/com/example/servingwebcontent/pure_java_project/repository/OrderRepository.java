package com.example.servingwebcontent.pure_java_project.repository;

import com.example.servingwebcontent.pure_java_project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // Bạn có thể thêm các phương thức truy vấn tùy chỉnh ở đây nếu muốn
    @Modifying
    @Transactional
    @Query("DELETE FROM Order o WHERE o.customer IS NULL OR o.product IS NULL")
    void deleteInvalidOrders();
}
