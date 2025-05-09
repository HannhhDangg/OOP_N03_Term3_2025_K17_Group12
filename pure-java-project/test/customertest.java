public class TestKhachHang {
    public static void main(String[] args) {
        KhachHang kh = new KhachHang("KH01", "Nguyen Van A", "a@gmail.com", "0123456789");

        assert kh.getHoTen().equals("Nguyen Van A");
        assert kh.getEmail().contains("@gmail.com");

        System.out.println("Tất cả test KhachHang passed.");
    }
}
