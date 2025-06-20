package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Order;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


@Service
public class OrderHistoryService {
    private final List<Order> orders = new ArrayList<>();

    public OrderHistoryService() {
        // Dữ liệu mẫu
        orders.add(new Order(1, 101, "Nguyễn Mạnh Hòa", "Áo Thun", 150000, 2,"datngu1",LocalDate.of(2025,02,04)));
        orders.add(new Order(2, 102, "Nguyễn Đình Đạt", "Quần Jean", 300000, 1,"datngu2",LocalDate.of(2025,03,04)));
        orders.add(new Order(3, 103, "Nguyễn Đăng Hanh", "Áo Sơ Mi", 200000, 3,"datngu3",LocalDate.of(2025,05,06)));
    }

    public List<Order> getOrdersByCustomerId(String customerId) {
        List<Order> result = new ArrayList<>();
        for (Order o : orders) {
            if (o.getCustomerId().equals(customerId)) {
            result.add(o);
        }
        }
        return result;
    }
}