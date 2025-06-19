package pure_java_project.service;

import pure_java_project.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsList {
    private List<Product> danhSachSanPham = new ArrayList<>();

    // Khởi tạo dữ liệu mẫu
    public ProductsList() {
        themSanPham(new Product("SP01", "Áo thun", "Áo", "M", "Trắng", 150000, 10));
        themSanPham(new Product("SP02", "Quần jeans", "Quần", "L", "Xanh", 300000, 5));
        themSanPham(new Product("SP03", "Giày", "Giày", "42", "Đen", 500000, 3));
    }

    // Lấy danh sách sản phẩm
    public List<Product> getAll() {
        return danhSachSanPham;
    }

    // Thêm sản phẩm
    public void themSanPham(Product sp) {
        try {
            danhSachSanPham.add(sp);
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi phương thức thêm sản phẩm.");
        }
    }

    // Sửa tên sản phẩm theo số lượng
    public void suaTenSanPhamTheoSoLuong(String tenMoi, int soLuong) {
        try {
            for (Product sp : danhSachSanPham) {
                if (sp.getSoLuong() == soLuong) {
                    danhSachSanPham.set(danhSachSanPham.indexOf(sp),
                        new Product(
                            sp.getMaSP(), tenMoi, sp.getLoai(), sp.getSize(),
                            sp.getMauSac(), sp.getGia(), sp.getSoLuong()
                        ));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi sửa tên sản phẩm: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi phương thức sửa tên sản phẩm.");
        }
    }

    // Xóa sản phẩm theo số lượng
    public void xoaSanPhamTheoSoLuong(int soLuong) {
        try {
            danhSachSanPham.removeIf(sp -> sp.getSoLuong() == soLuong);
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa sản phẩm: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi phương thức xóa sản phẩm.");
        }
    }
    
    public void inDanhSachSanPham() {
        try {
            for (Product sp : danhSachSanPham) {
                System.out.println("Mã SP: " + sp.getMaSP()
                    + " | Tên SP: " + sp.getTenSP()
                    + " | Loại: " + sp.getLoai()
                    + " | Size: " + sp.getSize()
                    + " | Màu sắc: " + sp.getMauSac()
                    + " | Giá: " + sp.getGia()
                    + " | Số lượng: " + sp.getSoLuong());
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi in danh sách sản phẩm: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi phương thức in danh sách sản phẩm.");
        }
    }
}
