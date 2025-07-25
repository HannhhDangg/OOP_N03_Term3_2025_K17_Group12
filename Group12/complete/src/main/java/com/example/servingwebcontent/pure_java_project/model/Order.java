package com.example.servingwebcontent.pure_java_project.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDonHang;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int soLuong;
    private LocalDate orderDate;

    public Order() {}

    public Order(Customer customer, Product product, int soLuong, LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.soLuong = soLuong;
        this.orderDate = orderDate;
    }

    public double getTongGia() {
        return (product != null ? product.getGia() : 0) * soLuong;
}



    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void displayOrder() {
        System.out.println("Mã đơn: " + maDonHang);
        System.out.println("Khách hàng: " + customer.getCustomerName());
        System.out.println("Sản phẩm: " + product.getTenSP());
        System.out.println("Giá: " + product.getGia());
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + getTongGia());
    }
}
