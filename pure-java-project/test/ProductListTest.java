public class ProductListTest {
    public static void main(String[] args) {
        productsList list = new productsList();

        // Thêm sản phẩm
        list.addmaSP(new maSP(1, "Áo thun", 10));
        list.addmaSP(new maSP(2, "Quần jeans", 5));
        list.addmaSP(new maSP(3, "Giày", 3));

        System.out.println("=== Danh sách ban đầu ===");
        list.printProductList();

        // Sửa tên sản phẩm có số lượng 5
        list.getEditmaSP("Quần kaki", 5);

        // Xoá sản phẩm có số lượng 3
        list.getDeletemaSP(3);

        System.out.println("=== Danh sách sau khi sửa và xoá ===");
        list.printProductList();
    }
}
