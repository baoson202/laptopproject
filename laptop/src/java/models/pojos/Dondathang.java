package models.pojos;
// Generated Nov 18, 2010 1:21:37 AM by Hibernate Tools 3.2.1.GA



/**
 * Dondathang generated by hbm2java
 */
public class Dondathang  implements java.io.Serializable {


     private DondathangId id;
     private Giohang giohang;
     private Khachhang khachhang;
     private double tongTien;
     private int trangThai;

    public Dondathang() {
    }

    public Dondathang(DondathangId id, Giohang giohang, Khachhang khachhang, double tongTien, int trangThai) {
       this.id = id;
       this.giohang = giohang;
       this.khachhang = khachhang;
       this.tongTien = tongTien;
       this.trangThai = trangThai;
    }
   
    public DondathangId getId() {
        return this.id;
    }
    
    public void setId(DondathangId id) {
        this.id = id;
    }
    public Giohang getGiohang() {
        return this.giohang;
    }
    
    public void setGiohang(Giohang giohang) {
        this.giohang = giohang;
    }
    public Khachhang getKhachhang() {
        return this.khachhang;
    }
    
    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }
    public double getTongTien() {
        return this.tongTien;
    }
    
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    public int getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }




}

