/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siswa2;

import java.sql.Date;

/**
 *
 * @author LIKMI
 */
public class NilaiModel {
    private String Npm,kodemk;
    private Date tanggal;
    private double nilai;
    private int hadir;
    
    public String getNpm(){  
        return Npm;    }
    
    public void setNpm(String npm) {  
        this.Npm = Npm;   
    }
    
    public String getKodemk() {   
        return kodemk;    
    }
    public void setKodemk(String kodemk) {  
        this.kodemk = kodemk;   
    }
    
    public Date getTanggal() {  
        return tanggal;   
    }
    public void setTanggal(Date tanggal) {   
        this.tanggal = tanggal;  
    }
    public double getNilai() {    
        return nilai;  
    }
    public void setNilai(double nilai) {    
        this.nilai = nilai;  
    }
    public int getHadir() {    
        return hadir;  
    }
    public void setHadir(int hadir) {  
        this.hadir = hadir;  
    }
}
