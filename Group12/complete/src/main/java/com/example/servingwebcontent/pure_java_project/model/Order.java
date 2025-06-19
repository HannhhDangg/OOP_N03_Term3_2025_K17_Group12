package com.example.servingwebcontent.pure_java_project.model;


public class Order {
    private int maDonHang;
    private int maSp;
    private String tenKh;
    private String tenSp;
    private float giaSp;
    private int soLuong;

    public Order() {} // Cần thiết cho Spring (default constructor)

    public Order(int maDonHang, int maSp, String tenKh, String tenSp, float giaSp, int soLuong) {
        this.maDonHang = maDonHang;
        this.maSp = maSp;
        this.tenKh = tenKh;
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.soLuong = soLuong;
    }

    public float getTongGia() {
        return this.giaSp * this.soLuong;
    }

    // Getters and Setters
    public int getMaDonHang() { return maDonHang; }
    public void setMaDonHang(int maDonHang) { this.maDonHang = maDonHang; }

    public int getMaSp() { return maSp; }
    public void setMaSp(int maSp) { this.maSp = maSp; }

    public String getTenKh() { return tenKh; }
    public void setTenKh(String tenKh) { this.tenKh = tenKh; }

    public String getTenSp() { return tenSp; }
    public void setTenSp(String tenSp) { this.tenSp = tenSp; }

    public float getGiaSp() { return giaSp; }
    public void setGiaSp(float giaSp) { this.giaSp = giaSp; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public void displayOrder() {
    System.out.println("Mã đơn: " + maDonHang);
    System.out.println("Mã sản phẩm: " + maSp);
    System.out.println("Tên KH: " + tenKh);
    System.out.println("Tên SP: " + tenSp);
    System.out.println("Giá SP: " + giaSp);
    System.out.println("Số lượng: " + soLuong);
    System.out.println("Thành tiền: " + getTongGia());
}

}
