import java.util.List;

public class orderHistoryTest{
    public static void testKhachCoDonHang(){
        List<Order> Order = OrderHistory.timDonHangTheoKhach(101);
        if(Order.size() == 2){
            System.out.println("test thanh cong");
        }else{
            System.out.println("test that bai");
        }
    }
    public static void testKhachKhongCoDonHang(){
        List<Order> Order = OrderHistory.timDonHangTheoKhach(999);
        if(Order.sisEmpty()){
            System.out.println("test thanh cong");
        }else{
            System.out.println("test that bai");
        }
    }
}