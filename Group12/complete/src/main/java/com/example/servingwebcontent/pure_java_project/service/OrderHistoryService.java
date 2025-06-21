package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderHistoryService {
    private final List<Order> orders = new ArrayList<>();

    public OrderHistoryService() {
        // Có thể khởi tạo mẫu đơn hàng ở đây nếu cần
    }

    // Lọc đơn hàng theo mã khách hàng
    public List<Order> getOrdersByCustomerId(String customerId) {
        List<Order> result = new ArrayList<>();
        for (Order o : orders) {
            if (o.getCustomer() != null && o.getCustomer().getCustomerId().equals(customerId)) {
                result.add(o);
            }
        }
        return result;
    }

    // Thêm đơn hàng vào lịch sử (tuỳ chọn nếu cần lưu cục bộ)
    public void addOrderToHistory(Order order) {
        orders.add(order);
    }
}
