import java.time.LocalDate;

public class Order {
    private int orderId;
    private int customerId;
    private LocalDate orderDate;
    private double amount;

    public Order(int orderId, int customerId, LocalDate orderDate, double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Date: " + orderDate + ", Amount: " + amount;
    }
}

