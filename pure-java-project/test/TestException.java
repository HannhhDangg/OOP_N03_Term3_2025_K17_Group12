package Error; // Nếu bạn đặt các file vào package Error

public class TestException {
    public static void main(String[] args) {
        // Tạo đối tượng của MyExceptionThrower
        MyExceptionThrower thrower = new MyExceptionThrower();

        try {
            System.out.println(">>> Gọi phương thức f() trong MyExceptionThrower");
            thrower.f(); // phương thức này sẽ ném MyException
        } catch (MyException e) {
            // Bắt lỗi MyException và in thông tin lỗi
            System.out.println("Bắt lỗi MyException: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Khối finally luôn chạy
            System.out.println("Khối finally chạy sau cùng.");
        }
    }
}

