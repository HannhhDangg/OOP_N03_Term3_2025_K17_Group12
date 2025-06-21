package com.example.servingwebcontent.pure_java_project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    private String maSP;
    private String tenSP;
    private String loai;
    private String size;
    private String mauSac;
    private double gia;
    private int soLuong;

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
}
