package com.example.servingwebcontent.pure_java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.service.ProductsList;
@Controller
public class ProductController {

    @Autowired
    private ProductsList productsList;

    @GetMapping("/products")
    public String danhSachSanPham(Model model) {
        model.addAttribute("products", productsList.getAll());
        return "product_list"; // Giao diện Thymeleaf
    }

    @PostMapping("/products/them")
    public String themSanPham(
            @RequestParam String maSP,
            @RequestParam String tenSP,
            @RequestParam String loai,
            @RequestParam String size,
            @RequestParam String mauSac,
            @RequestParam double gia,
            @RequestParam int soLuong) {
        productsList.themSanPham(new com.example.servingwebcontent.pure_java_project.model.Product(
                maSP, tenSP, loai, size, mauSac, gia, soLuong
        ));
        return "redirect:/products";
    }
    @PostMapping("/products/sua-ten")
    public String suaTen(@RequestParam String tenMoi, @RequestParam int soLuong) {
        productsList.suaTenSanPhamTheoSoLuong(tenMoi, soLuong);
        return "redirect:/products";
    }

    @PostMapping("/products/xoa")
    public String xoa(@RequestParam int soLuong) {
        productsList.xoaSanPhamTheoSoLuong(soLuong);
        return "redirect:/products";
    }
}
