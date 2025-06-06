public class Pay {
    public static void main(String[] args) {
        OrderList ds = new OrderList();

        Order o1 = new Order();
        o1.ma_sp = 1;
        o1.ten_sp = "Áo thun trắng";
        o1.so_luong = 2;
        o1.don_gia = 150000;

        Order o2 = new Order();
        o2.ma_sp = 2;
        o2.ten_sp = "Quần jean";
        o2.so_luong = 1;
        o2.don_gia = 350000;

        ds.addOrder(o1);
        ds.addOrder(o2);

        ds.inHoaDon();
    }
}
