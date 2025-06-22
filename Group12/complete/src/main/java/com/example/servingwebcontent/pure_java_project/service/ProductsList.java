package com.example.servingwebcontent.pure_java_project.service;

import org.springframework.stereotype.Service;

import com.example.servingwebcontent.pure_java_project.model.Product;
import com.example.servingwebcontent.pure_java_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;

@Service
public class ProductsList {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }
    public ProductsList() {}

    //Thêm sản phẩm
      public void themSanPham(Product sp) {
        try {
            productRepository.save(sp);
            System.out.println("Đã thêm sản phẩm: " + sp.getTenSP());
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
        }
    }


     public void suaTenSanPhamTheoMaSanPham(String maSP, String tenMoi) {
        try {
            Optional<Product> optionalProduct = productRepository.findById(maSP);
            if (optionalProduct.isPresent()) {
                Product sp = optionalProduct.get();
                sp.setTenSP(tenMoi);
                productRepository.save(sp);
                System.out.println("Đã cập nhật tên sản phẩm có mã: " + maSP);
            } else {
                System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi sửa tên sản phẩm: " + e.getMessage());
        }
    }

    // Xóa sản phẩm theo Mã sản phẩm
     public void xoaSanPhamTheoMaSanPham(String maSP) {
        try {
            if (productRepository.existsById(maSP)) {
                productRepository.deleteById(maSP);
                System.out.println("Đã xóa sản phẩm có mã: " + maSP);
            } else {
                System.out.println("Không tìm thấy sản phẩm để xóa với mã: " + maSP);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa sản phẩm: " + e.getMessage());
            System.out.println("Hiện tại đang có đơn hàng có sản phẩm này nên không thể xóa!");
        }
    }
    
    // Khong can thiet khi dung web  
    //public void inDanhSachSanPham() {
    //     try {
    //         for (Product sp : danhSachSanPham) {
    //             System.out.println("Mã SP: " + sp.getMaSP()
    //                 + " | Tên SP: " + sp.getTenSP()
    //                 + " | Loại: " + sp.getLoai()
    //                 + " | Size: " + sp.getSize()
    //                 + " | Màu sắc: " + sp.getMauSac()
    //                 + " | Giá: " + sp.getGia()
    //                 + " | Số lượng: " + sp.getSoLuong());
    //         }
    //     } catch (Exception e) {
    //         System.out.println("Lỗi khi in danh sách sản phẩm: " + e.getMessage());
    //     } finally {
    //         System.out.println("Đã gọi phương thức in danh sách sản phẩm.");
    //     }
    // }
}
