import java.util.ArrayList;

public class productsList {
    ArrayList<maSP> ma = new ArrayList<>();

    // Thêm sản phẩm
    public ArrayList<maSP> addmaSP(maSP maS) {
        ma.add(maS);
        return ma;
    }

    // Sửa tên sản phẩm theo số lượng
    public ArrayList<maSP> getEditmaSP(String tenSP, int soLuong) {
        for (int i = 0; i < ma.size(); i++) {
            if (ma.get(i).soluong == soLuong) {
                System.out.println("true");
                ma.get(i).tenSP = tenSP;
            }
        }
        return ma;
    }

    // Xóa sản phẩm theo số lượng
    public ArrayList<maSP> getDeletemaSP(int soLuong) {
        ma.removeIf(sp -> sp.soluong == soLuong);
        return ma;
    }

    // In danh sách sản phẩm
    public void printProductList() {
        int len = ma.size();
        for (int i = 0; i < len; i++) {
            System.out.println("Mã SP: " + ma.get(i).masp + " | Tên SP: " + ma.get(i).tenSP + " | Số lượng: " + ma.get(i).soluong);
        }
    }
}
