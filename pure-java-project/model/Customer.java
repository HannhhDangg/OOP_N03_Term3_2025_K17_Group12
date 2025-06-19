public class Customer {
    private String customerId;
    private String customerName;
    private String email;
    private String password;
    private String phoneNumber;

    public Customer(String customerId, String customerName, String email, String password, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Có thể thêm các getter/setter khác nếu cần
}
