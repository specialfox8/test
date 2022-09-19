/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package siswa2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author steve
 */
public class FXMLDocumentController implements Initializable {
    
       
    @FXML
    private MenuItem mastersiswa;
    @FXML
    private MenuItem mastermatakuliah;
    @FXML
    private MenuItem transaksipenilaian;
    @FXML
    private MenuItem displaysiswa;
    @FXML
    private MenuItem displaymatakuliah;
    @FXML
    private MenuItem displaypenilaian;
    @FXML
    private MenuItem keluar;
    
    public static DBSiswa dtsiswa= new DBSiswa();
    public static DBNilai dtnilai= new DBNilai();
    public static DBMataKuliah dtmk= new DBMataKuliah();
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void siswaklik(ActionEvent event) {
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_InputSiswa.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void matakuliahklik(ActionEvent event) {
    }

    @FXML
    private void penilaianklik(ActionEvent event) {
    }

    @FXML
    private void displaysiswaklik(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_displaysiswa.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }

    }

    @FXML
    private void displaymatakuliahklik(ActionEvent event) {
            try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_DisplayMataKuliah.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void displaypenilaianklik(ActionEvent event) {
    }

    @FXML
    private void keluarklik(ActionEvent event) {
        System.exit(0);
    }
    
}
