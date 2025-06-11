import java.util.*;

public class ProductManager {

    // Phân loại sản phẩm theo loại
    public static Map<String, List<Product>> phanLoaiSanPham(List<Product> danhSachSanPham) {
        Map<String, List<Product>> phanLoaiMap = new HashMap<>();

        for (Product sp : danhSachSanPham) {
            String loai = sp.getLoai(); // Lấy loại sản phẩm

            // Nếu loại chưa tồn tại trong map, thêm mới danh sách
            if (!phanLoaiMap.containsKey(loai)) {
                phanLoaiMap.put(loai, new ArrayList<>());
            }

            // Thêm sản phẩm vào danh sách theo loại
            phanLoaiMap.get(loai).add(sp);
        }

        return phanLoaiMap;
    }
}
