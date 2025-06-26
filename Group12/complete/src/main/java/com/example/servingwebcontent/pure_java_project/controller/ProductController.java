package com.example.servingwebcontent.pure_java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.repository.ProductRepository;
import com.example.servingwebcontent.pure_java_project.service.ProductsList;
// import com.example.servingwebcontent.pure_java_project.model.Product;
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductsList productService;

    @GetMapping("/products")
    public String danhSachSanPham(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "product_list"; // Giao diện Thymeleaf
    }

    @PostMapping("/products/them")
    public String themSanPham(
            @RequestParam String tenSP,
            @RequestParam String loai,
            @RequestParam String size,
            @RequestParam String mauSac,
            @RequestParam double gia,
            @RequestParam int soLuong) {

        // Sinh mã SP tự động theo định dạng SP01, SP02...
        long count = productRepository.count() + 1;
        String maSP = String.format("SP%02d", count);


        Product product = new Product( maSP,  tenSP,  loai,  size,  mauSac ,gia, soLuong);

        productRepository.save(product);

        return "redirect:/products";
    }
    @PostMapping("/products/sua-ten")
    public String suaTen(@RequestParam String maSP, @RequestParam String tenMoi) {
        productService.suaTenSanPhamTheoMaSanPham(maSP, tenMoi);
        return "redirect:/products";
}


    @PostMapping("/products/xoa")
    public String xoa(@RequestParam String maSP) {
        productService.xoaSanPhamTheoMaSanPham(maSP);
        return "redirect:/products";
    }
}
