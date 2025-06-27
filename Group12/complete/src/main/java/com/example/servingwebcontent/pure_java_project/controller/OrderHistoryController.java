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

// Hiển thị form nhập mã khách hàng
@GetMapping("/order-history")
public String showHistory() {
return "history";
}

// Gửi dữ liệu mã khách hàng để xem lịch sử đơn hàng
@PostMapping("/order-history")
public String viewOrderHistory(@RequestParam("customerId") String customerId, Model model) {
List<Order> orders = orderHistoryService.getOrdersByCustomerId(customerId);
model.addAttribute("orders", orders);
model.addAttribute("customerId", customerId);

if (orders.isEmpty()) {
model.addAttribute("error", "Không tìm thấy đơn hàng cho mã khách hàng: " + customerId);
} else {
double tongTien = orderHistoryService.getTotalMoneyByCustomerId(customerId);
model.addAttribute("tongTien", tongTien);
}

return "history";
}


// Đường dẫn thay thế nếu muốn truy cập qua /history
@GetMapping("/history")
public String showHistoryPage() {
return "history";
}


}
