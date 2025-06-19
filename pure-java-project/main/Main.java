public class Main {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();

        // Thêm khách hàng
        Customer c1 = new Customer("KH01", "Nguyen Van A", "a@gmail.com", "123", "0123456789");
        Customer c2 = new Customer("KH02", "Le Thi B", "b@gmail.com", "456", "0987654321");

        customerList.themKhachHang(c1);
        customerList.themKhachHang(c2);

        // Hiển thị danh sách khách hàng
        System.out.println("== Danh sách khách hàng ==");
        customerList.hienThiDanhSach();

        // Sửa tên
        customerList.suaKhachHang("KH02", "Tran Thi B");

        // Xóa khách hàng
        customerList.xoaKhachHang("KH01");

        // Hiển thị lại
        System.out.println("== Sau khi sửa và xóa ==");
        customerList.hienThiDanhSach();
    }
}
