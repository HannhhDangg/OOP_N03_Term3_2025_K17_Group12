package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Order;
import com.example.servingwebcontent.pure_java_project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryService {

@Autowired
private OrderRepository orderRepository;

// Lọc đơn hàng theo mã khách hàng từ CSDL
public List<Order> getOrdersByCustomerId(String customerId) {
String keyword = customerId.trim().toLowerCase(); // chuẩn hóa input

return orderRepository.findAll().stream()
.filter(order -> order.getCustomer() != null
&& order.getCustomer().getCustomerId().trim().toLowerCase().equals(keyword))
.toList();
}

public double getTotalMoneyByCustomerId(String customerId) {
return getOrdersByCustomerId(customerId).stream()
.mapToDouble(Order::getTongGia)
.sum();
}

}
