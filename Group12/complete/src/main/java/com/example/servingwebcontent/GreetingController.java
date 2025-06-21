package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import com.example.servingwebcontent.pure_java_project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class GreetingController {
	@Autowired
    private OrderService orderService;

	@GetMapping("/")
	public String hienThiDonHang(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        model.addAttribute("tongTien", orderService.getTotalMoney());
        return "home";
    }

	
}
