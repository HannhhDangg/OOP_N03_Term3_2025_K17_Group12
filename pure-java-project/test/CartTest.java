public class CartTest {
    public static void test() {
        Cart gioHangTest = new Cart();

        Product sp1 = new Product("SP01", "Áo thun", "Thời trang", "M", "Đen", 150000, 2);
        Product sp2 = new Product("SP02", "Quần jeans", "Thời trang", "32", "Xanh", 300000, 1);
        Product sp3 = new Product("SP03", "Giày thể thao", "Giày dép", "42", "Trắng", 500000, 1);

        gioHangTest.themSanPham(sp1);
        gioHangTest.themSanPham(sp2);
        gioHangTest.themSanPham(sp3);

       
        System.out.println("===== TEST: HIỂN THỊ GIỎ HÀNG =====");
        gioHangTest.hienThiGioHang();
    }
}
