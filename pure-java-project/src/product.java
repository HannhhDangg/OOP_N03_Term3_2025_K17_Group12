public class Product{
     String maSP;
     String tenSP;
     String loai;
     String size;
     String mauSac;
     double gia;
     int soLuong;
}
product(String maSP, String tenSP, String loai, String size, String mauSac, double gia, int soLuong){
    this.maSP = maSP;
    this.tenSP = tenSP;
    this.loai = loai;
    this.size = size;
    this.mauSac = mauSac;
    this.gia = gia;
    this.soLuong = soLuong;
}
public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }