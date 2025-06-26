package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.repository.CustomerRepository;
import com.example.servingwebcontent.pure_java_project.repository.ProductRepository;
import com.example.servingwebcontent.pure_java_project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    // Hiển thị danh sách đơn hàng
    @GetMapping("/orders")
    public String hienThiDonHang(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        model.addAttribute("tongTien", orderService.getTotalMoney());

        // Thêm danh sách khách hàng và sản phẩm để hiện trong dropdown
        model.addAttribute("customers", customerRepository.findAll());
        model.addAttribute("products", productRepository.findAll());

        return "orders";
    }


    // Thêm đơn hàng mới (theo customerId và maSp)
    @PostMapping("/orders/add")
    public String themDonHang(@RequestParam String customerId,
                            @RequestParam String maSp,
                            @RequestParam int soLuong, Model model) {
                                System.out.println(maSp);
        System.out.println(customerId);
        System.out.println(soLuong);
        orderService.addOrder(customerId, maSp, soLuong);
        return hienThiDonHang(model);
    }

    // Sửa tên sản phẩm
    @PostMapping("/orders/edit")
    public String suaTenSanPham(@RequestParam int maDonHang,
                            @RequestParam String tenSp, Model model) {
        orderService.editOrderProductName(maDonHang, tenSp);
        return hienThiDonHang(model);
    }

    // ✅ Xoá đơn hàng
    @PostMapping("/orders/delete")
    public String xoaDonHang(@RequestParam int maDonHang, Model model) {

        orderService.deleteOrder(maDonHang);

        return hienThiDonHang(model);
    }

    // Xoá đơn hàng
    // @PostMapping("/orders/delete")
    // public String xoaDonHang(@RequestParam int maDonHang) {
    //     orderService.deleteOrder(maDonHang);


       
    //     return "redirect:/orders";
    // }
}
