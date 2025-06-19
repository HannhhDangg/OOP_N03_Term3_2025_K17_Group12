package com.example.demo.controller;

import com.example.demo.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class OrderController {

    @GetMapping("/orders")
    public String hienThiDonHang(Model model) {
        // Dữ liệu giả lập
        List<Order> danhSach = Arrays.asList(
            new Order(1, 101, "Nguyễn Văn A", "Áo Thun", 150000, 2),
            new Order(2, 102, "Trần Thị B", "Quần Jean", 300000, 1),
            new Order(3, 103, "Lê Văn C", "Áo Sơ Mi", 200000, 3)
        );

        model.addAttribute("orders", danhSach);
        return "orders";
    }
}
