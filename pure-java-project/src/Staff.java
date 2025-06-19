public class Staff extends User {
    public Staff(String id, String name, String email, String password) {
        super(id, name, email, password, "Staff");
    }

    public void quanLySanPham() {
        System.out.println(name + " đang quản lý sản phẩm...");
    }

    public void quanLyDonHang() {
        System.out.println(name + " đang quản lý đơn hàng...");
    }
}
