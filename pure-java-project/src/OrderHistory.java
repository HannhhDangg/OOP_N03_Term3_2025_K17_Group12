import java.sql.*;
import java.util.*;

public class OrderHistory{
    public static void xemLichSuMuaHang(int ma_kh){
        String url = " link database";
        String username = "root";
        String password = "020405";

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            String sql = "SELECT id,date,total_amount FROM orders WHERE ma_kh = ? ORDER BY date DESC";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,ma_kh);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Lich su mua hang cua khach hang co ID : " + ma_kh);
            while(rs.next()){
                int ma_don_hang = rs.getInt("id");
                Date date = rs.getDate("date");
                double total = rs.getDouble("tong_gia");

                System.out.println("don hang # " + ma_don_hang + "|ngay : " + date + "|tong tien : " + total);
            }
            rs.close();
            stmt.close();
            conn.close();

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("loi khi truy van co so du lieu !!!");
        }
    }
}