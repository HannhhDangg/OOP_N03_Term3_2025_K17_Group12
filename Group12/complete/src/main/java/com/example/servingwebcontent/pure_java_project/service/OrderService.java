package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Order;
import com.example.servingwebcontent.pure_java_project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Thêm đơn hàng
    
    public void addOrder(Order order) {
    order.setMaSp(new Random().nextInt(100000)); // hoặc logic sinh số tự tăng
    order.setCustomerId("KH" + System.currentTimeMillis()); // mã KH tự sinh
    order.setOrderDate(LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh")));; //Gán ngày hôm nay
    orderRepository.save(order);
    System.out.println("Đã thêm đơn hàng mới.");
}


    // Sửa tên sản phẩm theo mã đơn hàng
    public void editOrder(String tenSp, int maDonHang) {
        Optional<Order> optionalOrder = orderRepository.findById(maDonHang);
        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setTenSp(tenSp);
            orderRepository.save(order);
            System.out.println("Đã cập nhật tên sản phẩm.");
        } else {
            System.out.println("Không tìm thấy đơn hàng để cập nhật.");
        }
    }

    // Xóa đơn hàng theo mã đơn hàng
    public void deleteOrder(int maDonHang) {
        if (orderRepository.existsById(maDonHang)) {
            orderRepository.deleteById(maDonHang);
            System.out.println("Đã xóa đơn hàng.");
        } else {
            System.out.println("Không tìm thấy đơn hàng để xóa.");
        }
    }

    // Lấy danh sách tất cả đơn hàng
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Tính tổng tiền tất cả đơn hàng
    public float getTotalMoney() {
        return (float) orderRepository.findAll().stream()
                .mapToDouble(Order::getTongGia)
                .sum();
    }

    // In hóa đơn (console)
    public void inHoaDon() {
        List<Order> orders = orderRepository.findAll();
        if (orders.isEmpty()) {
            System.out.println("Không có đơn hàng nào để hiển thị.");
            return;
        }

        System.out.println("========= DANH SÁCH ĐƠN HÀNG =========");
        int i = 1;
        for (Order o : orders) {
            System.out.println("Đơn hàng #" + (i++));
            o.displayOrder(); // Phải có sẵn trong class Order
            System.out.println("--------------------------------------");
        }
        System.out.println("Tổng tiền đơn hàng: " + getTotalMoney());
        System.out.println("=======================================");
    }
    
}
