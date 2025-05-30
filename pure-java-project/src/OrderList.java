import java.util.ArrayList;

public class OrderList {

    ArrayList<Order> od = new ArrayList<Order>();

    // phuong thuc add
    public ArrayList<Order> addOrder(Order ord) {
        od.add(ord);
        if (o.ma_sp == ord.ma_sp) {
            System.out.println("Đơn hàng với mã sản phẩm này đã tồn tại!");
            return od;
        }
        return od;
    }

    // phuong thuc edit ten san pham
    public ArrayList<Order> getEditOrder(String ten_sp, int ma_sp) {
        for (int i = 0; i < od.size(); i++) {
            if (od.get(i).ma_sp == ma_sp) {
                System.out.print("true");
                od.get(i).ten_sp = ten_sp;
            }
        }
        return od;
    }

    //phuong thuc delete
    public ArrayList<Order> getDeleteOrder(int ma_sp){
        for(int i = 0;i< od.size();i++){
            if(od.get(i).ma_sp == ma_sp){
                od.remove(i);
            }
        }
        return od;
    }

    //in danh sach don hang
    public void printOrderList(){
        int len = od.size();

        for(int i = 0; i< len ;i++){
            System.out.println("Mã sản phẩm: " + od.get(i).ma_sp + "tên sản phầm: " + od.get(i).ten_sp);
        }
    }

    //tinh tong tien
    /*
     * Todo:
     * cong thuc tinh tong tien ?
     * input ?
     * output ?
     * input => output ?x
     */
    public double getTotalMoney(){
        double tong_tien = 0;
        for(int i =0 ;i<od.size();i++){
            tong_tien += od.get(i).getTongGia();
        }
        return tong_tien;
    }

}

