package application;



import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utils.MySqlUtils;

public class addAutoController {

    @FXML
    private TextField cijenaNaDan;

    @FXML
    private TextField godinaProizvodnje;

    @FXML
    private TextField idKategorija;

    @FXML
    private TextField idOsiguranje;

    @FXML
    private TextField idServis;

    @FXML
    private TextField naziv;

    @FXML
    private TextField registracija;

    @FXML
    private TextField vrstaMjenjaca;
    
    @FXML
    private TextField model;

    @FXML
    private AnchorPane ap;
    
    public void createAction(ActionEvent e)
    {
    	MySqlUtils.addAuto(registracija.getText(), naziv.getText(), model.getText(), vrstaMjenjaca.getText(),  (Date) godinaProizvodnje.getUserData(), Double.parseDouble(cijenaNaDan.getText()),
    			 Integer.parseInt(idOsiguranje.getId()),Integer.parseInt(idKategorija.getId()), Integer.parseInt(idServis.getText()));
    	Stage stage = (Stage) ap.getScene().getWindow();
		stage.hide();
    }
    
    
   

    
}


