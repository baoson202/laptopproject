package models.pojos;
// Generated Nov 18, 2010 1:20:56 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Sanpham generated by hbm2java
 */
public class Sanpham  implements java.io.Serializable {


     private Integer id;
     private Hang hang;
     private Loaisanpham loaisanpham;
     private String ten;
     private int soLuongTon;
     private Double donGia;
     private String hinhAnh;
     private String chiTiet;
     private Set giohangSanphams = new HashSet(0);

    public Sanpham() {
    }

	
    public Sanpham(Hang hang, Loaisanpham loaisanpham, String ten, int soLuongTon, String hinhAnh, String chiTiet) {
        this.hang = hang;
        this.loaisanpham = loaisanpham;
        this.ten = ten;
        this.soLuongTon = soLuongTon;
        this.hinhAnh = hinhAnh;
        this.chiTiet = chiTiet;
    }
    public Sanpham(Hang hang, Loaisanpham loaisanpham, String ten, int soLuongTon, Double donGia, String hinhAnh, String chiTiet, Set giohangSanphams) {
       this.hang = hang;
       this.loaisanpham = loaisanpham;
       this.ten = ten;
       this.soLuongTon = soLuongTon;
       this.donGia = donGia;
       this.hinhAnh = hinhAnh;
       this.chiTiet = chiTiet;
       this.giohangSanphams = giohangSanphams;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Hang getHang() {
        return this.hang;
    }
    
    public void setHang(Hang hang) {
        this.hang = hang;
    }
    public Loaisanpham getLoaisanpham() {
        return this.loaisanpham;
    }
    
    public void setLoaisanpham(Loaisanpham loaisanpham) {
        this.loaisanpham = loaisanpham;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getSoLuongTon() {
        return this.soLuongTon;
    }
    
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public Double getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public String getHinhAnh() {
        return this.hinhAnh;
    }
    
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public String getChiTiet() {
        return this.chiTiet;
    }
    
    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    public Set getGiohangSanphams() {
        return this.giohangSanphams;
    }
    
    public void setGiohangSanphams(Set giohangSanphams) {
        this.giohangSanphams = giohangSanphams;
    }




}

