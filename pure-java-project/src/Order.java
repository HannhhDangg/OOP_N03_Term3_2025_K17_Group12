package src;

public class Order {
    String ma_sp;
    String ten_kh;
    String ten_sp;
    float tong_gia;

    public Order(String ma_sp, String ten_kh, String ten_sp, float tong_gia) {
        this.ma_sp = ma_sp;
        this.ten_kh = ten_kh;
        this.ten_sp = ten_sp;
        this.tong_gia = tong_gia;
    }

    public void displayOrder() {
        System.out.println("Mã đơn hàng: " + ma_sp);
        System.out.println("Khách hàng: " + ten_kh);
        System.out.println("Sản phẩm: " + ten_sp);
        System.out.println("Tổng tiền: " + tong_gia);
    }
}