public class TestSanPham {
    public static void main(String[] args) {
        SanPham sp = new SanPham("SP01", "Áo thun", "Áo", "L", "Đen", 150000.0, 20);

        assert sp.getTenSP().equals("Áo thun");
        assert sp.getGia() == 150000.0;
        assert sp.getSoLuong() == 20;

        System.out.println("Test SanPham passed.");
    }
}
