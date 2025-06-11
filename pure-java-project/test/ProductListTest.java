public class ProductListTest {
    public static void main(String[] args) {
        ProductsList list = new ProductsList();

        // Thêm sản phẩm
        list.themSanPham(new Product("SP01", "Áo thun", "Áo", "M", "Trắng", 150000, 10));
        list.themSanPham(new Product("SP02", "Quần jeans", "Quần", "L", "Xanh", 300000, 5));
        list.themSanPham(new Product("SP03", "Giày", "Giày", "42", "Đen", 500000, 3));

        System.out.println("=== Danh sách ban đầu ===");
        list.inDanhSachSanPham();

        // Sửa tên sản phẩm có số lượng 5
        list.suaTenSanPhamTheoSoLuong("Quần kaki", 5);

        // Xoá sản phẩm có số lượng 3
        list.xoaSanPhamTheoSoLuong(3);

        System.out.println("=== Danh sách sau khi sửa và xoá ===");
        list.inDanhSachSanPham();
    }
}
