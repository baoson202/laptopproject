/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models.daos;

import com.mysql.jdbc.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.pojos.Khachhang;
import models.util.MySqlDataAccessHelper;






/**
 *
 * @author Administrator
 */
public class DAOKhachHang {
      public static Khachhang getKhachHangByID(int id){
        return null;

    }
    public static boolean DangKy(Khachhang kh){
        boolean result = true;
        try {
            Connection connect = MySqlDataAccessHelper.getConnection();
            String sql = "{call sp_DangKyKhachHang('" +
                    kh.getUsername()+ "','"
                    + kh.getPassword() + "','" +
                    kh.getTen() + "','" +
                    kh.getDiaChi() + "','"
                    + kh.getEmail() + "',"
                    + 2 +
                     ")}";
                    
                    
            CallableStatement cs = connect.prepareCall(sql);
            

            int n = cs.executeUpdate();
            if (n == 0) {
                result =false;
            }
            
            connect.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
     public static Khachhang KiemTraDangNhap(String username, String password){
        Khachhang kh =null;
        try {
            Connection connect = MySqlDataAccessHelper.getConnection();
            CallableStatement cs = connect.prepareCall("{call sp_KiemTraDangNhap('"
                    + username +"','" + password
                    + "')}");
            
            

            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                kh = new Khachhang();
                kh.setUsername(rs.getString("username"));
                kh.setPassword(rs.getString("password"));
                kh.setTen(rs.getString("Ten"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setEmail(rs.getString("Email"));
                kh.setLoainguoidung(rs.getInt("LoaiNguoiDung"));
                    
            }

            connect.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return kh;


   }
}
