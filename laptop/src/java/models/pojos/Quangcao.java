package models.pojos;
// Generated Nov 18, 2010 1:20:56 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Quangcao generated by hbm2java
 */
public class Quangcao  implements java.io.Serializable {


     private int id;
     private String nguoiDaiDien;
     private String diaChi;
     private String dienThoai;
     private int trangThai;
     private String hinhAnh;
     private Date thoiHan;
     private double soTien;

    public Quangcao() {
    }

    public Quangcao(int id, String nguoiDaiDien, String diaChi, String dienThoai, int trangThai, String hinhAnh, Date thoiHan, double soTien) {
       this.id = id;
       this.nguoiDaiDien = nguoiDaiDien;
       this.diaChi = diaChi;
       this.dienThoai = dienThoai;
       this.trangThai = trangThai;
       this.hinhAnh = hinhAnh;
       this.thoiHan = thoiHan;
       this.soTien = soTien;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNguoiDaiDien() {
        return this.nguoiDaiDien;
    }
    
    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getDienThoai() {
        return this.dienThoai;
    }
    
    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    public int getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    public String getHinhAnh() {
        return this.hinhAnh;
    }
    
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public Date getThoiHan() {
        return this.thoiHan;
    }
    
    public void setThoiHan(Date thoiHan) {
        this.thoiHan = thoiHan;
    }
    public double getSoTien() {
        return this.soTien;
    }
    
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }




}


