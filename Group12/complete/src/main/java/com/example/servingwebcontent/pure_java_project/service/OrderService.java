package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Customer;
import com.example.servingwebcontent.pure_java_project.model.Order;
import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.repository.CustomerRepository;
import com.example.servingwebcontent.pure_java_project.repository.OrderRepository;
import com.example.servingwebcontent.pure_java_project.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
// import java.util.Random;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    // Thêm đơn hàng
    
    public String addOrder(Order order) {
    // Kiểm tra trùng mã đơn hàng
    if (orderRepository.existsById(order.getMaDonHang())) {
        return "Đơn hàng đã tồn tại!";
    }

    // Tìm sản phẩm
    Product product = productRepository.findById(String.valueOf(order.getMaSp())).orElse(null);
    if (product == null) {
        return "Sản phẩm không tồn tại!";
    }

    // Tìm khách hàng
    Customer customer = customerRepository.findById(order.getCustomerId()).orElse(null);
    if (customer == null) {
        return "Khách hàng không tồn tại!";
    }

    // Gán thông tin phụ
    order.setTenSp(product.getTenSP());
    order.setGiaSp((float) product.getGia());
    order.setTenKh(customer.getCustomerName());
    order.setOrderDate(LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh")));

    orderRepository.save(order);
    return "Đã thêm đơn hàng thành công!";
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
