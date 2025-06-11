import java.util.ArrayList;

public class ProductsList {
    private ArrayList<Product> danhSachSanPham = new ArrayList<>();

    // Thêm sản phẩm
    public void themSanPham(Product sp) {
        danhSachSanPham.add(sp);
    }

    // Sửa tên sản phẩm theo số lượng
    public void suaTenSanPhamTheoSoLuong(String tenMoi, int soLuong) {
        for (Product sp : danhSachSanPham) {
            if (sp.getSoLuong() == soLuong) {
                // Không có setter, nên sửa cần thêm setter hoặc tái tạo object.
                // Cách 1: Dùng setter nếu có
                // sp.setTenSP(tenMoi);

                // Cách 2: Thay thế đối tượng mới (tạm thời giả định không có setter)
                danhSachSanPham.set(danhSachSanPham.indexOf(sp), 
                    new Product(
                        sp.getMaSP(), tenMoi, sp.getLoai(), sp.getSize(),
                        sp.getMauSac(), sp.getGia(), sp.getSoLuong()
                    ));
            }
        }
    }

    // Xóa sản phẩm theo số lượng
    public void xoaSanPhamTheoSoLuong(int soLuong) {
        danhSachSanPham.removeIf(sp -> sp.getSoLuong() == soLuong);
    }

    // In danh sách sản phẩm
    public void inDanhSachSanPham() {
        for (Product sp : danhSachSanPham) {
            System.out.println("Mã SP: " + sp.getMaSP()
                + " | Tên SP: " + sp.getTenSP()
                + " | Loại: " + sp.getLoai()
                + " | Size: " + sp.getSize()
                + " | Màu sắc: " + sp.getMauSac()
                + " | Giá: " + sp.getGia()
                + " | Số lượng: " + sp.getSoLuong());
        }
    }
}
