import java.util.ArrayList;
import java.util.List;

public class customerList{
    ArrayList<customer> ct = new ArrayList<customer>();
    public ArrayList<customer>addcustomer<customer cus>{
        ct.add(cus);
        return ct;
    }
}
public ArrayList<customer>getEditcustomer(String ten_kh,Stirng ma_kh){
    for (int i = 0; i < ct.size(); i++) {
        if (ct.get(i).ma_kh == ma_kh) {
            System.out.print("true");
            ct.get(i).ten_kh = ten_kh;
        }
    }
    return ct;
}
 public ArrayList<customer> getDeletecustomer(String ma_kh) {
    for (int i = 0; i < ct.size(); i++) {
        if (ct.get(i).ma_kh == ma_kh) {
            ct.remove(i);
        }
    }
 }
 public void printcustomerList() {
    int len = ct.size();
    for (int i = 0; i < len; i++) {
        System.out.println("Ma khach hang : " + ct.get(i).ma_kh + " Ten khach hang : " + ct.get(i).ten_kh);
    }
}
