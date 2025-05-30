package src;

public class Order {
    String ma_don_hang;
    String ma_sp;
    String ten_kh;
    String ten_sp;
    float don_gia;
    int so_luong;

    public Order(String ma_don_hang, String ma_sp, String ten_kh, String ten_sp, float don_gia, int so_luong) {
        this.ma_don_hang = ma_don_hang;
        this.ma_sp = ma_sp;
        this.ten_kh = ten_kh;
        this.ten_sp = ten_sp;
        this.don_gia = don_gia;
        this.so_luong = so_luong;
        }

    public float getTongGia() {
        return don_gia * so_luong;
    }   

    public void displayOrder() {
        System.out.println("Mã đơn hàng: " + ma_don_hang);
        System.out.println("Mã sản phẩm: " + ma_sp);
        System.out.println("Khách hàng: " + ten_kh);
        System.out.println("Sản phẩm: " + ten_sp);
        System.out.println("Số lượng: " + so_luong);
        System.out.println("Đơn giá: " + don_gia);
        System.out.println("Tổng tiền: " + getTongGia());
    }
}
