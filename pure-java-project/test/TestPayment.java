import java.util.Scanner;

public class TestPayment {
    public static void test() {
        // Tạo giỏ hàng và thêm sản phẩm mẫu
        Cart cart = new Cart();
        Product sp1 = new Product("SP01", "Áo thun", "Thời trang", "L", "Trắng", 150000, 2);
        Product sp2 = new Product("SP02", "Quần jeans", "Thời trang", "M", "Xanh", 300000, 1);

        cart.themSanPham(sp1);
        cart.themSanPham(sp2);

        // Tạo đối tượng thanh toán
        Payment payment = new Payment(cart);

        // Gọi phương thức thanh toán
        payment.thanhToan();
    }
}
