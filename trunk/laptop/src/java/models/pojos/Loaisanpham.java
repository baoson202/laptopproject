package models.pojos;
// Generated Nov 18, 2010 1:20:56 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Loaisanpham generated by hbm2java
 */
public class Loaisanpham  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String moTa;
     
    public Loaisanpham() {
    }

	
    public Loaisanpham(String ten) {
        this.ten = ten;
    }
    public Loaisanpham(Integer id, String ten, String moTa) {
        this.id = id;
       this.ten = ten;
       this.moTa = moTa;
       
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
   



}


