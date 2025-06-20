package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.Order;
import com.example.servingwebcontent.pure_java_project.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderHistoryController {

    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/order-history")
    public String showForm() {
        return "history";
    }

    @PostMapping("/order-history")
    public String viewOrderHistory(@RequestParam("customerId") String customerId, Model model) {
        List<Order> orders = orderHistoryService.getOrdersByCustomerId(customerId);
        model.addAttribute("orders", orders);
        model.addAttribute("customerId", customerId);
        if (orders.isEmpty()) {
            model.addAttribute("error", "Không tìm thấy đơn hàng cho mã khách hàng: " + customerId);
        }
        return "history";
    }
}