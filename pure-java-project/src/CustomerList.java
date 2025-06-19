import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<Customer> customers = new ArrayList<>();

    public void themKhachHang(Customer c) {
        customers.add(c);
    }

    public void suaKhachHang(String customerId, String newName) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(customerId)) {
                c.setCustomerName(newName);
                return;
            }
        }
    }

    public void xoaKhachHang(String customerId) {
        customers.removeIf(c -> c.getCustomerId().equals(customerId));
    }

    public void hienThiDanhSach() {
        for (Customer c : customers) {
            System.out.println("Mã KH: " + c.getCustomerId() + " | Tên KH: " + c.getCustomerName());
        }
    }
}
