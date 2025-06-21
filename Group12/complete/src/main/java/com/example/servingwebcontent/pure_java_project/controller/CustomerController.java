package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.Customer;
import com.example.servingwebcontent.pure_java_project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // Hiển thị danh sách khách hàng
    @GetMapping("/customers")
    public String hienThiKhachHang(Model model) {
        List<Customer> danhSachKhachHang = customerRepository.findAll();
        model.addAttribute("customers", danhSachKhachHang);
        return "customer"; // Tên file HTML Thymeleaf để hiển thị
    }

    // Thêm khách hàng mới
    @PostMapping("/customers/add")
    public String themKhachHang(
            @RequestParam String customerName,
            @RequestParam String address,
            @RequestParam String email,
            @RequestParam String phone) {

        String newCustomerId = "KH" + UUID.randomUUID().toString().substring(0, 6);

        Customer customer = new Customer(newCustomerId, customerName, address, email, phone);
        customerRepository.save(customer);

        return "redirect:/customers";
    }

    // Sửa thông tin khách hàng
    @PostMapping("/customers/edit")
    public String suaKhachHang(
            @RequestParam String customerId,
            @RequestParam String customerName,
            @RequestParam String address,
            @RequestParam String email,
            @RequestParam String phone) {

        Customer existing = customerRepository.findById(customerId).orElse(null);
        if (existing != null) {
            existing.setCustomerName(customerName);
            existing.setAddress(address);
            existing.setEmail(email);
            existing.setPhone(phone);
            customerRepository.save(existing);
        }

        return "redirect:/customers";
    }

    // Xóa khách hàng
    @PostMapping("/customers/delete")
    public String xoaKhachHang(@RequestParam String customerId) {
        customerRepository.deleteById(customerId);
        return "redirect:/customers";
    }
}
