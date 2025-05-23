import java.util.ArrayList;
public class productsList {
    ArrayList<maSP> ma = new ArrayList<maSP>();
    public ArrayList<maSP> addmaSP(maSP maS);
    ma.add(maS);
    return ma;
}
// thêm sản phẩm
public ArrayList<maSP>getEditmaSP(String tenSP,int soLuong){
    for(int i = 0; i < ma.size(); i++){
        if(ma.get(i).soluong == soLuong){
            System.out.print("true");
            ma.get(i).tenSP = tenSP;
        }
    }
    return ma;
}
// xoa sản phẩm theo số 
public ArrayList<maSP>getDeletemaSP(int soLuong){
    for(int i = 0; i < ma.size(); i++){
        if(ma.get(i).masp == maSP);
            ma.remove(i);
    }
    return ma;
}


//in ra
public void printproducList(){
    int len = ma.size();
    for(int i = 0; i < len; i++){
        System.out.println("Ma sp:" + ma.get(i).masp + "ten sp:" +st.get(i).tenSP)''
    }
}