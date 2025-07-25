# Members:
1. Nguyen Manh Hoa
2. Nguyen Dinh Dat
3. Nguyen Dang Hanh
4. Nguyen Le Thu

   Link ReadMe : https://hannhhdangg.github.io/OOP_N03_Term3_2025_K17_Group12/

Câu 1 :
o	Đề tài : Quản lý shop bán đồ may mặc 
Câu 2 :
o	Lớp Product (Sản phẩm) Đây là lớp cơ bản đại diện cho một sản phẩm quần áo, bao gồm thông tin về tên sản phẩm, loại, kích cỡ, màu sắc, giá, v.v. 
o	Thuộc tính:
•	productId: Mã sản phẩm (mã duy nhất).
•	name: Tên sản phẩm. 
•	size: Kích cỡ (ví dụ: S, M, L, XL).
•	color: Màu sắc.
•	price: Giá sản phẩm.
•	quantity: Số lượng sản phẩm còn trong kho.
•	category: Loại sản phẩm (ví dụ: áo, quần, váy).
o	Lớp Customer (Khách hàng) Lớp này lưu trữ thông tin khách hàng như tên, email, số điện thoại, và lịch sử đơn hàng. 
o	Thuộc tính:
•	customerId: Mã khách hàng.
•	customerName: Tên khách hàng.
•	email: Địa chỉ email.
•	phone: Số điện thoại.
•	address:địa chỉ của khách hàng.
o	Lớp Order (Đơn hàng) Lớp này đại diện cho một đơn hàng, bao gồm các sản phẩm mà khách hàng đã đặt và thông tin thanh toán. 
o	Thuộc tính:
•	MaDonHang: Mã đơn hàng.
•	customer: Khách hàng đã đặt đơn hàng.
•	Product : Danh sách các sản phẩm trong đơn hàng.
•	total_price: Tổng giá trị của đơn hàng.
•	Soluong : số lượng sản phẩm.
•	orderDate : ngày tạo đơn hàng.

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


![image](https://github.com/user-attachments/assets/2b8f9ed2-efe4-4982-a3de-b42e3839ef46)
![image](https://github.com/user-attachments/assets/f28ecb42-77fd-46a7-a2e4-847d2b5b7aa5)
![image](https://github.com/user-attachments/assets/c0a2efc6-1484-40da-93c6-d2261ad8d99c)


Chú ý Sơ đồ hành vi sử dụng: 
+ Sequence Diagram
+ Or [Hoặc] Activity Diagram


Nội dung 05:
-Chức năng quản lý mua hàng:
Câu 1:Lưu đồ thuật toán


![image](https://github.com/user-attachments/assets/75593095-4b27-4fe5-b4c5-bc5a1152dd7f)


Yêu cầu số 8:
Câu 1:
orders: 
![image](https://github.com/user-attachments/assets/bdf9ec79-e895-49d1-b7a6-65bec1d23f89)
Hiển thị ra danh sách đơn hàng đã tạo cùng với các chức năng thêm, sửa, xóa đơn hàng.

products
![Screenshot 2025-06-20 090500](https://github.com/user-attachments/assets/efa30ac8-4475-486a-aaf4-f3d04095e1e0)

Hiển thị danh sách sản phẩm, sửa, xóa, thêm sản phẩm.

orderHistory :
![orderHistory](https://github.com/user-attachments/assets/39c88c3b-efc4-457c-b5f9-e068603e227d)
Xem lịch sử mua hàng của từng khách hàng.

![image](https://github.com/user-attachments/assets/4b625fba-134e-4f26-a665-1f0ed3eeab92)




