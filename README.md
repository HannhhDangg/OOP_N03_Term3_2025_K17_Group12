#Members:
1. Nguyen Manh Hoa
2. Nguyen Dinh Dat
3. Nguyen Dang Hanh
4. Nguyen Le Thu

Câu 1 : Quản lý shop bán quần áo
Câu 2 :
+ Lớp Product (Sản phẩm) Đây là lớp cơ bản đại diện cho một sản phẩm quần áo, bao gồm thông tin về tên sản phẩm, loại, kích cỡ, màu sắc, giá, v.v.
Thuộc tính:
- productId: Mã sản phẩm (mã duy nhất).
- name: Tên sản phẩm. o size: Kích cỡ (ví dụ: S, M, L, XL).
- color: Màu sắc.
- price: Giá sản phẩm.
- quantity: Số lượng sản phẩm còn trong kho.
- category: Loại sản phẩm (ví dụ: áo, quần, váy).
+ Lớp Category (Danh mục sản phẩm) Lớp này quản lý các danh mục sản phẩm như quần áo nam, nữ, phụ kiện, v.v.
Thuộc tính:
- categoryId: Mã danh mục.
- categoryName: Tên danh mục (ví dụ: Áo, Quần, Phụ kiện).
- products: Danh sách các sản phẩm thuộc danh mục này.
+ Lớp Customer (Khách hàng) Lớp này lưu trữ thông tin khách hàng như tên, email, số điện thoại, và lịch sử đơn hàng.
Thuộc tính:
- customer_id: Mã khách hàng.
- name: Tên khách hàng.
- email: Địa chỉ email.
- phone: Số điện thoại.
- order_history: Lịch sử đơn hàng của khách hàng.
+ Lớp Order (Đơn hàng) Lớp này đại diện cho một đơn hàng, bao gồm các sản phẩm mà khách hàng đã đặt và thông tin thanh toán.
Thuộc tính:
- order_id: Mã đơn hàng.
- customer: Khách hàng đã đặt đơn hàng.
- products: Danh sách các sản phẩm trong đơn hàng.
- total_price: Tổng giá trị của đơn hàng.
+ Lớp Inventory (Quản lý kho) Lớp này quản lý các sản phẩm trong kho của shop. •
Thuộc tính:
o products: Danh sách các sản phẩm có trong kho. •
+ Lớp Sales (Bán hàng) • Lớp này quản lý các giao dịch bán hàng, tạo và xử lý đơn hàng.

  Câu 3,4,5 : https://github.com/HannhhDangg/OOP_N03_Term3_2025_K17_Group12/tree/main/pure-java-project



