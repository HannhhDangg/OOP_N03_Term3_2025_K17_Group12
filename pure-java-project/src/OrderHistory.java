import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private static List<Order> orderList = new ArrayList<>();

    public static void mockData() {
        orderList.add(new Order(1, 101, LocalDate.of(2025, 5, 1), 50000.0));
        orderList.add(new Order(2, 102, LocalDate.of(2025, 6, 1), 30000.0));
        orderList.add(new Order(3, 101, LocalDate.of(2025, 6, 15), 45000.0));
    }

    public static void viewOrderHistory(int customerId) {
        System.out.println("Lịch sử mua hàng của khách hàng có ID: " + customerId);
        boolean found = false;
        for (Order order : orderList) {
            if (order.getCustomerId() == customerId) {
                System.out.println(order);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có đơn hàng nào.");
        }
    }

    public static List<Order> findOrdersByCustomer(int customerId) {
        List<Order> result = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getCustomerId() == customerId) {
                result.add(order);
            }
        }
        return result;
    }

    public static void xemLichSuMuaHang(int maKhachHang) {
        viewOrderHistory(maKhachHang);
    }

    public static List<Order> timDonHangTheoKhach(int maKhachHang) {
        return findOrdersByCustomer(maKhachHang);
    }
}

