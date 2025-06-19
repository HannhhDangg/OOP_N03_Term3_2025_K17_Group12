import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private static List<Order> orderList = new ArrayList<>();

    public static void mockData() {
        orderList.add(new Order(1, 101, "Nguyễn Văn A", "Áo thun", 50000, 1));
        orderList.add(new Order(2, 102, "Trần Thị B", "Quần jeans", 30000, 2));
        orderList.add(new Order(3, 101, "Nguyễn Văn A", "Giày", 45000, 1));
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
