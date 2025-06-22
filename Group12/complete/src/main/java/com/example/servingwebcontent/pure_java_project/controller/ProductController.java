package com.example.servingwebcontent.pure_java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.repository.CustomerRepository;
import com.example.servingwebcontent.pure_java_project.repository.ProductRepository;
import com.example.servingwebcontent.pure_java_project.model.Customer;
// import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.service.ProductsList;
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String danhSachSanPham(Model model) {
        model.addAttribute("products", productRepository.findAll());
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

        Product product = new Product( maSP,  tenSP,  loai,  size,  mauSac ,gia, soLuong);

        productRepository.save(product);

        return "redirect:/products";
    }
    @PostMapping("/products/sua-ten")
    public String suaTen(@RequestParam String maSP,@RequestParam String tenMoi) {
        // productRepository.suaTenSanPhamTheoMaSanPham(maSP,tenMoi);
        return "redirect:/products";
    }

    @PostMapping("/products/xoa")
    public String xoa(@RequestParam String maSP) {
        // productRepository.xoaSanPhamTheoMaSanPham(maSP);
        return "redirect:/products";
    }
}
