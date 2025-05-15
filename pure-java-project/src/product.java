public class Product{
    private String maSP;
    private String tenSP;
    private String loai;
    private String size;
    private String mauSac;
    private double gia;
    private int soLuong;
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