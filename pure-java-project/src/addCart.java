import java.util.ArrayList;
import java.util.List;

public class addCart {
private List<Product> items = new ArrayList<>();

public void addToCart(Product product) {
if (checkAvailability(product)) {
items.add(product);
System.out.println(" Sản phẩm có mã " + product.getId() + " đã được thêm vào giỏ hàng.");
} else {
System.out.println("Sản phẩm có mã " + product.getId() + " đã hết hàng.");
}
}

private boolean checkAvailability(Product product) {
return product.getQuantity() > 0;
}

public List<Product> getItems() {
return items;
}

public void displayCart() {
if (items.isEmpty()) {
System.out.println("Giỏ hàng đang trống.");
} else {
System.out.println("\nDanh sách sản phẩm trong giỏ hàng:");
for (Product product : items) {
System.out.println("- Mã: " + product.getId()
+ " | Tên: " + product.getProductName()
+ " | Size: " + product.getSize()
+ " | Màu: " + product.getColor()
+ " | Số lượng: " + product.getQuantity());
}
}
}
}