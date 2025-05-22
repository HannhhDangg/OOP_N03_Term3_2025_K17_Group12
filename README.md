#Members:
1. Nguyen Manh Hoa
2. Nguyen Dinh Dat
3. Nguyen Dang Hanh
4. Nguyen Le Thu

Câu 1 : Quản lý shop bán đồ may mặc
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

  Nội dung 01:
Xây dựng ứng dụng quản lý shop bán đồ may mặc

Yêu cầu:
- Giao diện Java Spring Boot.
- Có chức năng quản lý quần áo

+ Thêm, sửa, xóa các sản phẩm quần áo mới và cũ

+ Liệt kê thông tin chi tiết về từng loại quần áo, có thể lọc ra các loại quần áo theo kích thước,mùa,giới tính,độ tuổi.
  
- Có chức năng quản lý khách hàng
+ Thêm, sửa, xóa đơn hàng,thông tin khách hàng
- Có chức năng gán sản phẩm cho phòng khách hàng

- Dữ liệu được lưu trữ xuống file nhị phân

+ Cần tạo các lớp liên quan đến khách hàng, sản phẩm , và đơn hàng để đọc, ghi xuống 1 hay nhiều file.

- Khi làm việc với dữ liệu trong bộ nhớ, dữ liệu cần được lưu trữ dưới dạng các Collection tùy chọn như ArrayList, LinkedList, Map, ....

- Sinh viên có thể thêm các chức năng vào chương trình để ứng dụng phong phú hơn bằng cách thêm các nghiệp vụ cho bài toán (tùy chọn)

Nội dung 02:

01 sơ đồ Class Diagram của bài tập lớn
![image](https://github.com/user-attachments/assets/8fd30920-43ec-444f-bdea-fd6b0fa403b6)



Nội dung 03:

03 sơ đồ Behavioural Diagram của bài tập lớn cho 03 chức năng cụ thể, ví dụ 01 sơ đồ cho chức năng thêm đối tượng, 01 sơ đồ cho xóa đối tượng, và 01 sơ đồ cho sửa đối tượng. 

![image](https://github.com/user-attachments/assets/f28ecb42-77fd-46a7-a2e4-847d2b5b7aa5)

Chú ý Sơ đồ hành vi sử dụng: 
+ Sequence Diagram
![image](https://github.com/user-attachments/assets/3bad24ef-1b1e-4a69-831a-9a8d469c694e)

+ Or [Hoặc] Activity Diagram



