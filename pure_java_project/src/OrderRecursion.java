package src;

public class OrderRecursion {

    public static void inDonHang(Order1 donHang, int capDo) {
        for (int i = 0; i < capDo; i++) {
            System.out.print("  ");
        }

        donHang.hienThiDonHang(); // thong tin don hang hien tai

        for (Order1 donHangCon : donHang.donHangCons) {
            inDonHang(donHangCon, capDo + 1);
        }
    }
}
