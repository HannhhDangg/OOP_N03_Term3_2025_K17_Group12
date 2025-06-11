import java.util.List;

public class OrderHistoryTest {
    public static void runTests() {
        System.out.println("=== Đang chạy test OrderHistory ===");

        OrderHistory.mockData();

        System.out.println("\nTest 1: Lịch sử khách hàng có đơn hàng (ID: 101)");
        OrderHistory.xemLichSuMuaHang(101);

        System.out.println("\nTest 2: Lịch sử khách hàng không có đơn hàng (ID: 999)");
        OrderHistory.xemLichSuMuaHang(999);

        System.out.println("\nTest 3: Trả về danh sách đơn hàng (findOrdersByCustomer)");
        List<Order> orders = OrderHistory.timDonHangTheoKhach(102);
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
