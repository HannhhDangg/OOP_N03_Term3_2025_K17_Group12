import java.sql.*;
import java.util.*;

public class OrderHistory{
    private static List<Order> Order = new ArrayList<>();
    public static void mockData(){
        Order.add(new Order(1,101,new Date(124,4,1),500000));
        Order.add(new Order(2,102,new Date(124,5,1),300000));
        Order.add(new Order(3,101,new Date(124,5,15),450000));
    }
    public static void xemLichSuMuaHang(int ma_kh){
        System.out.println("lich su mua hang cua khach hang co ID : " + ma_kh);
        boolean found = false;
        for(Order order : orders){
            if(order.getma_kh() == ma_kh){
                System.out.println(Order);
                found = true;
            }
        }
        if(!found){
            System.out.println("khong co don hang nao");
        }
    }
}