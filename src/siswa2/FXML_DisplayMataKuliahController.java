/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package siswa2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author LIKMI
 */
public class FXML_DisplayMataKuliahController implements Initializable {
@FXML
    private TableView<MKModel> tbvmatakuliah;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         ObservableList<MKModel> data=FXMLDocumentController.dtmk.Load();
        if(data!=null){            
            tbvmatakuliah.getColumns().clear();
            tbvmatakuliah.getItems().clear();
            TableColumn col=new TableColumn("KodeMK");
            col.setCellValueFactory(new PropertyValueFactory<MKModel, String>("kodemk"));
            tbvmatakuliah.getColumns().addAll(col);
            col=new TableColumn("NamaMK");
            col.setCellValueFactory(new PropertyValueFactory<MKModel, String>("namamk"));
            tbvmatakuliah.getColumns().addAll(col);
            col=new TableColumn("SkS");
            col.setCellValueFactory(new PropertyValueFactory<MKModel, String>("sks"));
            tbvmatakuliah.getColumns().addAll(col);
            col=new TableColumn("Praktek");
            col.setCellValueFactory(new PropertyValueFactory<MKModel, String>("praktek"));
            tbvmatakuliah.getColumns().addAll(col);
            tbvmatakuliah.setItems(data);
        }else {
            Alert a=new Alert(Alert.AlertType.ERROR,"Data kosong",ButtonType.OK);
            a.showAndWait();
            tbvmatakuliah.getScene().getWindow().hide();;
        }        
    }    
    
}
