package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Order;
import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.model.Customer;
import com.example.servingwebcontent.pure_java_project.repository.OrderRepository;
import com.example.servingwebcontent.pure_java_project.repository.ProductRepository;
import com.example.servingwebcontent.pure_java_project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public float getTotalMoney() {
        float total = 0;
        for (Order order : orderRepository.findAll()) {
            total += order.getTongGia();
        }
        return total;
    }

    public void addOrder(String customerId, String maSp, int soLuong) {
        Optional<Customer> customerOpt = customerRepository.findById(customerId);
        Optional<Product> productOpt = productRepository.findById(maSp);

        if (customerOpt.isPresent() && productOpt.isPresent()) {
            Order order = new Order();
            order.setCustomer(customerOpt.get());
            order.setProduct(productOpt.get());
            order.setSoLuong(soLuong);
            order.setOrderDate(LocalDate.now());
            orderRepository.save(order);
        } else {
            throw new IllegalArgumentException("Không tìm thấy khách hàng hoặc sản phẩm.");
        }
    }

    public void editOrderProductName(int maDonHang, String tenMoi) {
        Optional<Order> orderOpt = orderRepository.findById(maDonHang);
        if (orderOpt.isPresent()) {
            Order order = orderOpt.get();
            Product product = order.getProduct();
            product.setTenSP(tenMoi); // cập nhật tên sản phẩm
            productRepository.save(product);
        }
    }

    public void deleteOrder(int maDonHang) {
        orderRepository.deleteById(maDonHang);
    }

    public List<Order> getOrdersByCustomerId(String customerId) {
        return orderRepository.findAll().stream()
                .filter(o -> o.getCustomer().getCustomerId().equals(customerId))
                .toList();
    }
}
