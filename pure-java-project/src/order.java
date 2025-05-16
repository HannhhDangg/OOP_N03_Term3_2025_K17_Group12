import java.util.ArrayList;
import java.util.List;

public class Order {
        public String ma_sp;
        public Customer khachhang;
        public List<Product> cac_sp;
        public double tong_tien;

    public Order(String ma_sp, Customer khachhang, List<Product> cac_sp) {
        this.ma_sp = ma_sp;
        this.khachhang = khachhang;
        this.cac_sp = cac_sp;
        this.tong_tien = calculateTotalPrice();
    }

    public String getma_sp() {
        return ma_sp;
    }

    public void setma_sp(String ma_sp) {
        this.ma_sp = ma_sp;
    }

    public Customer getkhachhang() {
        return khachhang;
    }

    public void setkhachhang(Customer khachhang) {
        this.khachhang = khachhang;
    }

    public List<Product> getcac_sp() {
        return cac_sp;
    }

    public void setcac_sp(Product> cac_sp){}
        this.cac_sp = cac_sp
        this.tong_tien = calculateTotalPrice();
    }

    public double gettong_tien(){
        return tong_tien;
    }

    private double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " | Price: " + product.getPrice());
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
