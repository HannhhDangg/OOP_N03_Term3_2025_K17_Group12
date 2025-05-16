import java.util.ArrayList;
import java.util.List;

public class customer{
    String ma_kh;
    String ten_kh;
    String email;
    String so_dien_thoai;
    List<Order> ls_mua_hang;

    public customer(String customer_id,String customer_name,String email,String phonenumber,List<Order> orderHistory){
        this.ma_kh = ma_kh;
        this.ten_kh = ten_kh;
        this.email = email;
        this.so_dien_thoai = so_dien_thoai;
        this.ls_mua_hang = new ArrayList<>();
    }

    public String getma_kh(){
        return ma_kh;
    }
    public void setma_kh(String ma_kh){
        this.ma_kh = ma_kh;
    }

    public String getten_kh(){
        return ten_kh;
    }
    public void setten_kh(String ten_kh){
        this.ten_kh = ten_kh;
    }

    public String getemail(){
        return email;
    }
    public void setma_kh(String email){
        this.email = email;
    }

    public String getso_dien_thoai(){
        return so_dien_thoai;
    }
    public void setso_dien_thoai(String so_dien_thoai){
        this.so_dien_thoai = so_dien_thoai;
    }

    public List<Order> ls_mua_hang() {
        return ls_mua_hang;
    }

    public void addOrder(Order order) {
        this.ls_mua_hang.add(order);
    }

    public void Thong_tin_kh(){
        System.out.println("ma khach hang : " + ma_kh);
        System.out.println("ten khach hang : " + ten_kh);
        System.out.println("Email : " + email);
        System.out.println("so dien thoai khach hang : " + so_dien_thoai);
        System.out.println("so lan mua hang : " + ls_mua_hang.size());
    }





}