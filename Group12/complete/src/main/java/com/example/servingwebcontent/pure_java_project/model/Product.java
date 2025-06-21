package com.example.servingwebcontent.pure_java_project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private String maSP;
    private String tenSP;
    private String loai;
    private String size;
    private String mauSac;
    private double gia;
    private int soLuong;

    public Product() {} // Bắt buộc cho JPA
    // Nếu không có constructor mặc định, JPA sẽ không thể tạo đối tượng Product từ cơ sở dữ liệu


    // Constructor
    public Product(String maSP, String tenSP, String loai, String size, String mauSac, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loai = loai;
        this.size = size;
        this.mauSac = mauSac;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    // Getter methods
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getLoai() {
        return loai;
    }

    public String getSize() {
        return size;
    }

    public String getMauSac() {
        return mauSac;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Setter methods
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
