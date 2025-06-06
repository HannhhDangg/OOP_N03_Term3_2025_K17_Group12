import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> danhSachSP;

    public Cart() {
        danhSachSP = new ArrayList<>();
    }

    public void themSanPham(Product sp) {
        danhSachSP.add(sp);
    }

    public void hienThiGioHang() {
        double tongTien = 0;
        System.out.println("===== GIỎ HÀNG =====");

        for (Product sp : danhSachSP) {
            double thanhTien = sp.getGia() * sp.getSoLuong();
            tongTien += thanhTien;

            System.out.printf("Mã: %s | Tên: %s | Loại: %s | Size: %s | Màu: %s | Giá: %.0f | SL: %d | Thành tiền: %.0f\n",
                sp.getMaSP(), sp.getTenSP(), sp.getLoai(), sp.getSize(), sp.getMauSac(), sp.getGia(), sp.getSoLuong(), thanhTien);
        }

        System.out.println("----------------------");
        System.out.printf("Tổng tiền: %.0f VNĐ\n", tongTien);
    }
}
