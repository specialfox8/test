/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siswa2;

import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author LIKMI
 */
public class DBMataKuliah {
    private MKModel dt=new MKModel();    
    public MKModel getMKModel(){ return(dt);}
    public void setMKModel(MKModel s){ dt=s;}
    
    public ObservableList<MKModel>  Load() {
        try {
            ObservableList<MKModel> tableData=FXCollections.observableArrayList();
            Koneksi con = new Koneksi();
            con.bukaKoneksi();
            con.statement = con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select KodeMK,NamaMK,SKS,Praktek from matakuliah");
            int i = 1;
            while (rs.next()) {
                MKModel d=new MKModel();
                d.setKodemk(rs.getString("KodeMK"));
                d.setNamamk(rs.getString("NamaMK"));
                d.setSks(rs.getInt("SKS"));
                d.setPraktek(rs.getInt("Praktek"));
                tableData.add(d);
                i++;
            }
            con.tutupKoneksi();
            return tableData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
}
    }
}
