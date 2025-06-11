import java.util.ArrayList;

public class OrderListTest {
    public static void main(String[] args) { // Đã sửa lỗi ở đây
        OrderList ds = new OrderList();

        ds.addOrder(new Order(1001, 1, "Nguyễn Văn A", "Áo sơ mi", 200000f, 2));
        ds.addOrder(new Order(1002, 2, "Trần Thị B", "Quần jean", 350000f, 1));
        ds.addOrder(new Order(1003, 3, "Lê Văn C", "Giày thể thao", 800000f, 1));

        ds.inHoaDon();

        ds.getEditOrder("Quần kaki", 2);
        ds.getDeleteOrder(1);

        ds.inHoaDon();
    }
}