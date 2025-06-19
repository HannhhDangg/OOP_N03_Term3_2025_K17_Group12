import java.util.ArrayList;
import java.util.List;

public class AddCart {
    private List<Product> cart = new ArrayList<>();

    public void addToCart(Product product) {
        try {
            if (product == null) {
                System.out.println("Sản phẩm không hợp lệ.");
                return;
            }

            if (product.getSoLuong() > 0) {
                cart.add(product);
                System.out.println("Sản phẩm có mã " + product.getMaSP() + " đã được thêm vào giỏ hàng.");
            } else {
                System.out.println("Sản phẩm có mã " + product.getMaSP() + " đã hết hàng.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm sản phẩm vào giỏ hàng.");
        } finally {
            System.out.println("Thao tác thêm vào giỏ hàng đã kết thúc.");
        }
    }

    public void displayCart() {
        try {
            if (cart.isEmpty()) {
                System.out.println("Giỏ hàng đang trống.");
                return;
            }

            System.out.println("Danh sách sản phẩm trong giỏ hàng:");
            for (Product product : cart) {
                System.out.println("- Mã: " + product.getMaSP()
                        + " | Tên: " + product.getTenSP()
                        + " | Màu: " + product.getMauSac()
                        + " | Số lượng: " + product.getSoLuong());
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi hiển thị giỏ hàng.");
        } finally {
            System.out.println("Hoàn tất thao tác hiển thị giỏ hàng.");
        }
    }
}
