package models.pojos;
// Generated Nov 18, 2010 1:20:56 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Loainguoidung generated by hbm2java
 */
public class Loainguoidung  implements java.io.Serializable {


     private Integer id;
     private String ten;
     

    public Loainguoidung() {
    }

	
    public Loainguoidung(Integer id,String ten) {
        this.id = id;
        this.ten = ten;
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
    



}


