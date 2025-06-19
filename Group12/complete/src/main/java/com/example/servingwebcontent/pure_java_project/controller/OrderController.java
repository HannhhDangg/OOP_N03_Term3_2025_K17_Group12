package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.Order;
import com.example.servingwebcontent.pure_java_project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String hienThiDonHang(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        model.addAttribute("tongTien", orderService.getTotalMoney());
        return "orders";
    }

    @PostMapping("/orders/add")
    public String themDonHang(@ModelAttribute Order order) {
        orderService.addOrder(order);
        return "redirect:/orders";
    }

    @PostMapping("/orders/edit")
    public String suaTenSanPham(@RequestParam int maSp, @RequestParam String tenSp) {
        orderService.editOrder(tenSp, maSp);
        return "redirect:/orders";
    }

    @PostMapping("/orders/delete")
    public String xoaDonHang(@RequestParam int maSp) {
        orderService.deleteOrder(maSp);
        return "redirect:/orders";
    }
}
