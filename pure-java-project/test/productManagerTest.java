import java.util.*;

public class ProductManagerTest {
    public static void main(String[] args) {
        // Tạo danh sách sản phẩm mẫu để test
        List<Product> danhSach = new ArrayList<>();
        danhSach.add(new Product("SP01", "Áo Thun", "Áo", "M", "Trắng", 150000, 10));
        danhSach.add(new Product("SP02", "Quần Jean", "Quần", "L", "Xanh", 300000, 5));
        danhSach.add(new Product("SP03", "Áo Sơ Mi", "Áo", "S", "Đen", 200000, 7));
        danhSach.add(new Product("SP04", "Giày Thể Thao", "Giày", "42", "Trắng", 500000, 3));

        // Gọi phương thức phân loại
        Map<String, List<Product>> ketQua = ProductManager.phanLoaiSanPham(danhSach);

        // In kết quả ra để kiểm tra
        System.out.println("== KẾT QUẢ PHÂN LOẠI ==");
        for (String loai : ketQua.keySet()) {
            System.out.println("Loại: " + loai);
            for (Product sp : ketQua.get(loai)) {
                System.out.println("  - " + sp.getTenSP());
            }
        }

        // Kiểm tra số lượng nhóm phân loại
        if (ketQua.size() == 3 &&
            ketQua.containsKey("Áo") &&
            ketQua.containsKey("Quần") &&
            ketQua.containsKey("Giày")) {
            System.out.println("\n Thành công.");
        } else {
            System.out.println("\n Thất bại.");
        }
    }
}
