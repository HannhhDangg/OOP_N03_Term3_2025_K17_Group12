package pure_java_project.controller;

import pure_java_project.model.Product;
import pure_java_project.service.ProductsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class ProductController {

    @Autowired
    private ProductsList productsList;

    @GetMapping("/products")
    public String danhSachSanPham(Model model) {
        model.addAttribute("products", productsList.getAll());
        return "product_list"; // Giao diện Thymeleaf
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
