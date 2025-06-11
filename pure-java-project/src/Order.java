import java.time.LocalDate;

public class Order {
    public int ma_don_hang; // Tương ứng với orderId
    public int ma_sp;       // Tương ứng với customerId
    public String ten_kh;
    public String ten_sp;
    public float gia_sp;
    public int so_luong;

    // Constructor mới khớp với cách bạn tạo đối tượng trong OrderListTest
    public Order(int maDonHang, int maSp, String tenKhachHang, String tenSanPham, float giaSanPham, int soLuong) {
        this.ma_don_hang = maDonHang;
        this.ma_sp = maSp;
        this.ten_kh = tenKhachHang;
        this.ten_sp = tenSanPham;
        this.gia_sp = giaSanPham;
        this.so_luong = soLuong;
        // Bạn có thể thêm orderDate = LocalDate.now(); nếu muốn ngày hiện tại tự động gán
    }

    // Các phương thức cần thiết cho OrderList
    public float getTongGia() {
        return this.gia_sp * this.so_luong;
    }

    public void displayOrder() {
        System.out.println("Mã Đơn hàng: " + this.ma_don_hang);
        System.out.println("Mã SP: " + this.ma_sp);
        System.out.println("Tên KH: " + this.ten_kh);
        System.out.println("Tên SP: " + this.ten_sp);
        System.out.println("Giá SP: " + this.gia_sp);
        System.out.println("Số lượng: " + this.so_luong);
        System.out.println("Tổng giá: " + getTongGia());
    }

    // Giữ lại hoặc sửa đổi getCustomerId() nếu cần, hoặc xóa nếu không dùng
    public int getCustomerId() {
        return ma_sp; // Giả định customerId tương đương ma_sp ở đây
    }

    @Override
    public String toString() {
        return "Order ID: " + ma_don_hang + ", Tên SP: " + ten_sp + ", Số lượng: " + so_luong + ", Tổng: " + getTongGia();
    }
}