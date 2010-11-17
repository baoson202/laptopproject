package models.pojos;
// Generated Nov 18, 2010 1:21:37 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Khachhang generated by hbm2java
 */
public class Khachhang  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String ten;
     private String diaChi;
     private String email;
     private Set dondathangs = new HashSet(0);

    public Khachhang() {
    }

	
    public Khachhang(User user, String ten, String email) {
        this.user = user;
        this.ten = ten;
        this.email = email;
    }
    public Khachhang(User user, String ten, String diaChi, String email, Set dondathangs) {
       this.user = user;
       this.ten = ten;
       this.diaChi = diaChi;
       this.email = email;
       this.dondathangs = dondathangs;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getDondathangs() {
        return this.dondathangs;
    }
    
    public void setDondathangs(Set dondathangs) {
        this.dondathangs = dondathangs;
    }




}

