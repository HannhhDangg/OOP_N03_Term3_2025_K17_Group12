package src;

import java.util.ArrayList;
import java.util.List;

public class Order1 {
    String maSanPham;   
    String tenKhachHang; 
    String tenSanPham;   
    float tongGia;       
    List<Order1> donHangCons; 

    public Order1(String maSanPham, String tenKhachHang, String tenSanPham, float tongGia) {
        this.maSanPham = maSanPham;
        this.tenKhachHang = tenKhachHang;
        this.tenSanPham = tenSanPham;
        this.tongGia = tongGia;
        this.donHangsCon = new ArrayList<>();
    }

    public void ThemdonHangCon( Order1 donHangCon){
        donHangCons.add(donHangCon);
    }

    public void hienThiDonHang() {
        System.out.println("Mã đơn hàng: " + maSanPham);
        System.out.println("Khách hàng: " + tenKhachHang);
        System.out.println("Sản phẩm: " + tenSanPham);
        System.out.println("Tổng tiền: " + tongGia);
    }

    public void inDonHang(int capDo) {
        for (int i = 0; i < capDo; i++) {
            System.out.print("  ");
        }

        hienThiDonHang();
        for (Order1 donHangCon : donHangCons) {
            donHangCons.inDonHang(capDo + 1); 
        }
    }
}
