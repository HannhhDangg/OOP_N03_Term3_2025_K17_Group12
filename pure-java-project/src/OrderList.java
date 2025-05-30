import java.util.ArrayList;

public class OrderList {

    ArrayList<Order> od = new ArrayList<Order>();

    // phuong thuc add
    public ArrayList<Order> addOrder(Order ord) {
    for (Order o : od) {
        if (o.ma_sp == ord.ma_sp) {
            System.out.println("Đơn hàng với mã sản phẩm này đã tồn tại!");
            return od;
            }
        }
        od.add(ord);
        return od;
    }


    // phuong thuc edit ten san pham
    public ArrayList<Order> getEditOrder(String ten_sp, int ma_sp) {
        for (int i = 0; i < od.size(); i++) {
            if (od.get(i).ma_sp == ma_sp) {
                System.out.println("Đã cập nhật tên sản phẩm.");
                od.get(i).ten_sp = ten_sp;
            }
        }
        return od;
    }

    //phuong thuc delete
    public ArrayList<Order> getDeleteOrder(int ma_sp){
        for (int i = 0; i < od.size(); i++) {
            if (od.get(i).ma_sp == ma_sp) {
                od.remove(i);
                i--; 
            }
        }


        return od;
    }

    //tinh tong tien
    /*
     * Todo:
     * cong thuc tinh tong tien ?
     * input ?
     * output ?
     * input => output ?x
     */
    public float getTotalMoney() {
        float tong_tien = 0;
        for (Order o : od) {
            tong_tien += o.getTongGia();
        }
        return tong_tien;
}


    //in hoa don
    public void inHoaDon(){
        System.out.println("DANH SÁCH ĐƠN HÀNG");
        for(int i =0; i<od.size();i++){
            Order o = od.get(i);
            System.out.println("Đơn hàng #" + (i+1));
            o.displayOrder();
            System.out.println("----------------------------");
        }
        System.out.println("Tổng tiền đơn hàng: " + getTotalMoney());
        System.out.println("===========================================");
    }
}

