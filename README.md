#Members:
1. Nguyen Manh Hoa
2. Nguyen Dinh Dat
3. Nguyen Dang Hanh
4. Nguyen Le Thu


GROUP 12 PROJECT : QUẢN LÍ SHOP QUẦN ÁO
1. Lớp Product (Sản phẩm)
Đây là lớp cơ bản đại diện cho một sản phẩm quần áo, bao gồm thông tin về tên sản phẩm, loại, kích cỡ, màu sắc, giá, v.v.
Thuộc tính:
o	productId: Mã sản phẩm (mã duy nhất).
o	name: Tên sản phẩm.
o	size: Kích cỡ (ví dụ: S, M, L, XL).
o	color: Màu sắc.
o	price: Giá sản phẩm.
o	quantity: Số lượng sản phẩm còn trong kho.
o	category: Loại sản phẩm (ví dụ: áo, quần, váy).
2. Lớp Category (Danh mục sản phẩm)
Lớp này quản lý các danh mục sản phẩm như quần áo nam, nữ, phụ kiện, v.v.
•	Thuộc tính:
o	categoryId: Mã danh mục.
o	categoryName: Tên danh mục (ví dụ: Áo, Quần, Phụ kiện).
o	products: Danh sách các sản phẩm thuộc danh mục này.
3. Lớp Customer (Khách hàng)
Lớp này lưu trữ thông tin khách hàng như tên, email, số điện thoại, và lịch sử đơn hàng.
•	Thuộc tính:
o	customer_id: Mã khách hàng.
o	name: Tên khách hàng.
o	email: Địa chỉ email.
o	phone: Số điện thoại.
o	order_history: Lịch sử đơn hàng của khách hàng.
4. Lớp Order (Đơn hàng)
Lớp này đại diện cho một đơn hàng, bao gồm các sản phẩm mà khách hàng đã đặt và thông tin thanh toán.
•	Thuộc tính:
o	order_id: Mã đơn hàng.
o	customer: Khách hàng đã đặt đơn hàng.
o	products: Danh sách các sản phẩm trong đơn hàng.
o	total_price: Tổng giá trị của đơn hàng.
5. Lớp Inventory (Quản lý kho)
Lớp này quản lý các sản phẩm trong kho của shop.
•	Thuộc tính:
o	products: Danh sách các sản phẩm có trong kho.
6. Lớp Sales (Bán hàng)
•	Lớp này quản lý các giao dịch bán hàng, tạo và xử lý đơn hàng.
