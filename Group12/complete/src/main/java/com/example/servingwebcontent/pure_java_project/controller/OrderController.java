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

    // Hiển thị danh sách đơn hàng
    @GetMapping("/orders")
    public String hienThiDonHang(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        model.addAttribute("tongTien", orderService.getTotalMoney());
        return "orders";
    }

    @GetMapping("/")
    public String trangChu() {
        return "home";
    }

    // Thêm đơn hàng mới
    @PostMapping("/orders/add")
    public String themDonHang(@ModelAttribute Order order) {
        orderService.addOrder(order);
        return "redirect:/orders";
    }

    // Sửa tên sản phẩm theo mã đơn hàng
    @PostMapping("/orders/edit")
    public String suaTenSanPham(@RequestParam int maDonHang, @RequestParam String tenSp) {
        orderService.editOrder(tenSp, maDonHang); // sửa đúng theo maDonHang
        return "redirect:/orders";
    }

    // Xoá đơn hàng theo mã đơn hàng
    @PostMapping("/orders/delete")
    public String xoaDonHang(@RequestParam int maDonHang) {
        orderService.deleteOrder(maDonHang); // sửa đúng theo maDonHang
        return "redirect:/orders";
    }
}
