import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String customerName;
    private String email;
    private String phoneNumber;
    private List<Order> orderHistory;

    public Customer(String customerId, String customerName, String email, String phoneNumber, List<Order> orderHistory) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        if (orderHistory != null) {
            this.orderHistory = orderHistory;
        } else {
            this.orderHistory = new ArrayList<>();
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Order order) {
        this.orderHistory.add(order);
    }

    public void printCustomerInfo() {
        System.out.println("--- Thông tin khách hàng ---");
        System.out.println("Mã khách hàng: " + customerId);
        System.out.println("Tên: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + phoneNumber);
        if (orderHistory.isEmpty()) {
            System.out.println("Lịch sử đặt hàng: Chưa có đơn hàng nào.");
        } else {
            System.out.println("Lịch sử đặt hàng: " + orderHistory.size() + " đơn hàng.");
            // Bạn có thể muốn lặp lại và in chi tiết từng đơn hàng ở đây
            // Ví dụ:
            // for (Order order : orderHistory) {
            //     System.out.println("  - Mã đơn hàng: " + order.getOrderId() + ", Tổng cộng: " + order.getTotalAmount());
            // }
        }
        System.out.println("----------------------------");
    }