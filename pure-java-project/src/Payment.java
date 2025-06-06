import java.util.Scanner;

public class Payment {
    private Cart cart;

    public Payment(Cart cart) {
        this.cart = cart;
    }

    public void thanhToan() {
        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng trống. Không thể thanh toán.");
            return;
        }

        cart.hienThiGioHang(); // Hiển thị giỏ hàng và tổng tiền

        Scanner sc = new Scanner(System.in);

        System.out.print("Xác nhận thanh toán? (Y/N): ");
        String confirm = sc.nextLine();

        if (!confirm.equalsIgnoreCase("Y")) {
            System.out.println("Thanh toán đã bị hủy.");
            return;
        }

        // Nhập thông tin giao hàng
        System.out.println("Nhập thông tin giao hàng:");
        System.out.print("Họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Số điện thoại: ");
        String sdt = sc.nextLine();

        // In thông tin giao hàng
        System.out.println("\nThông tin giao hàng:");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + sdt);

        System.out.println("\n>> Đang xử lý thanh toán...");
        System.out.println("Đơn hàng của bạn đã được thanh toán thành công!");

        cart.clear();
    }
}
