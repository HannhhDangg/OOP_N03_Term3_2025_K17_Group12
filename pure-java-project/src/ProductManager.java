import java.util.*;

public class ProductManager {

    public static Map<String, List<Product>> phanLoaiSanPham(List<Product> danhSachSanPham) {
        Map<String, List<Product>> phanLoaiMap = new HashMap<>();

        try {
            for (Product sp : danhSachSanPham) {
                String loai = sp.getLoai();

                if (!phanLoaiMap.containsKey(loai)) {
                    phanLoaiMap.put(loai, new ArrayList<>());
                }

                phanLoaiMap.get(loai).add(sp);
            }
        } catch (Exception e) {
            System.err.println("Lỗi khi phân loại sản phẩm: " + e.getMessage());
        } finally {
            System.out.println("Đã thực hiện xong phân loại sản phẩm.");
        }

        return phanLoaiMap;
    }
}
