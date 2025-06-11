public class testAddCart {
public void testAddToCart() {
Product product1 = new Product("SP001", "Áo Thun", "M", "Trắng", 2);
Product product2 = new Product("SP002", "Quần Jean", "32", "Xanh", 0); // hết hàng

addCart cart = new addCart();
cart.addToCart(product1);
cart.addToCart(product2);

cart.displayCart();
}
}