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

    public void addOrder(String customerId, String masp, int soLuong) {
        System.out.println("=====================================");
        System.out.println(masp);
        System.out.println(customerId);
        System.out.println(soLuong);
        Optional<Customer> customerOpt = customerRepository.findById(customerId);
        Optional<Product> productOpt = productRepository.findById(masp);

        System.out.print(customerOpt.get().getCustomerName());
        System.out.print(productOpt.get().getTenSP());
        System.out.print(customerOpt.isPresent());
    

        if (customerOpt.isPresent() && productOpt.isPresent()) {
        Customer customer = customerOpt.get();
        Product product = productOpt.get();

        // ✅ Kiểm tra số lượng tồn kho
        if (soLuong > product.getSoLuong()) {
                throw new IllegalArgumentException("Số lượng đặt hàng vượt quá số lượng tồn kho. Chỉ còn " + product.getSoLuong() + " sản phẩm.");
            }

            // ✅ Trừ số lượng tồn kho
            product.setSoLuong(product.getSoLuong() - soLuong);
            productRepository.save(product);  // Cập nhật lại sản phẩm trong DB

            Order order = new Order();
            order.setCustomer(customer);
            order.setProduct(product);
            order.setSoLuong(soLuong);
            order.setOrderDate(LocalDate.now());

            orderRepository.save(order); // Lưu đơn hàng mới
        } else {
            throw new IllegalArgumentException("Không tìm thấy khách hàng hoặc sản phẩm.");
        }
    }

    public void editOrderProductName(int maDonHang, String tenMoi) {
        try {
            Optional<Order> orderOpt = orderRepository.findById(maDonHang);
            if (orderOpt.isPresent()) {
                Order order = orderOpt.get();
                Product product = order.getProduct();
                product.setTenSP(tenMoi); // cập nhật tên sản phẩm
                productRepository.save(product);
            }else{
                System.out.println("Không tìm thấy đơn hàng voi ma don hang: " + maDonHang);
            }
            }catch (Exception e) {
                System.out.println("Lỗi khi sửa tên sản phẩm: " + e.getMessage());
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
