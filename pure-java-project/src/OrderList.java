import java.util.ArrayList;

public class OrderList {

    ArrayList<Order> od = new ArrayList<Order>();

    // phuong thuc add
    public ArrayList<Order> addOrder(Order ord) {
        od.add(ord);
        return od;
    }

    // phuong thuc edit
    public ArrayList<Order> getEditOrder(String ten_sp, int ma_sp) {
        for (int i = 0; i < od.size(); i++) {
            if (od.get(i).ma_sp == ma_sp) {
                System.out.print("true");
                od.get(i).ten_sp = ten_sp;
            }
        }
        return od;
    }
}