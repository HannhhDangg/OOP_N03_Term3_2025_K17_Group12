package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Order;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final List<Order> od = new ArrayList<>();
    public OrderService() {
    od.add(new Order(1, 101, "Nguyễn Mạnh Hòa", "Áo Thun", 150000, 2));
    od.add(new Order(2, 102, "Nguyễn Đình Đạt", "Quần Jean", 300000, 1));
    od.add(new Order(3, 103, "Nguyễn Đăng Hanh", "Áo Sơ Mi", 200000, 3));
}



    // Thêm đơn hàng
    public List<Order> addOrder(Order ord) {
        try {
            for (Order o : od) {
                if (o.getMaSp() == ord.getMaSp()) {
                    System.out.println("Đơn hàng với mã sản phẩm này đã tồn tại!");
                    return od;
                }
            }
            od.add(ord);
            System.out.println("Đã thêm đơn hàng mới.");
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm đơn hàng.");
        } finally {
            System.out.println("Kết thúc phương thức.");
        }
        return od;
    }

    // Sửa tên sản phẩm
    public List<Order> editOrder(String ten_sp, int ma_sp) {
        try {
            boolean found = false;
            for (Order o : od) {
                if (o.getMaSp() == ma_sp) {
                    o.setTenSp(ten_sp);
                    System.out.println("Đã cập nhật tên sản phẩm.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy sản phẩm để cập nhật.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi sửa đơn hàng.");
        } finally {
            System.out.println("Kết thúc phương thức.");
        }
        return od;
    }

    // Xóa đơn hàng
    public List<Order> deleteOrder(int ma_sp) {
        try {
            boolean removed = od.removeIf(o -> o.getMaSp() == ma_sp);
            if (removed) {
                System.out.println("Đã xóa đơn hàng.");
            } else {
                System.out.println("Không tìm thấy đơn hàng để xóa.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa đơn hàng.");
        } finally {
            System.out.println("Kết thúc phương thức.");
        }
        return od;
    }

    // Lấy danh sách tất cả đơn hàng
    public List<Order> getAllOrders() {
        try {
            return od;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy danh sách đơn hàng.");
            return new ArrayList<>();
        } finally {
            System.out.println("Kết thúc phương thức.");
        }
    }

    // Tính tổng tiền
    public float getTotalMoney() {
        float tong_tien = 0;
        try {
            for (Order o : od) {
                tong_tien += o.getTongGia();
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi tính tổng tiền.");
        } finally {
            System.out.println("Kết thúc phương thức.");
        }
        return tong_tien;
    }

    // In hóa đơn
    public void inHoaDon() {
        try {
            if (od.isEmpty()) {
                System.out.println("Không có đơn hàng nào để hiển thị.");
                return;
            }

            System.out.println("========= DANH SÁCH ĐƠN HÀNG =========");
            for (int i = 0; i < od.size(); i++) {
                Order o = od.get(i);
                System.out.println("Đơn hàng #" + (i + 1));
                o.displayOrder(); // phương thức này phải được định nghĩa trong class Order
                System.out.println("--------------------------------------");
            }
            System.out.println("Tổng tiền đơn hàng: " + getTotalMoney());
            System.out.println("=======================================");
        } catch (Exception e) {
            System.out.println("Lỗi khi in hóa đơn.");
        } finally {
            System.out.println("Kết thúc phương thức.");
        }
    }
}
