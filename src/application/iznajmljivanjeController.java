package application;


import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import rental.Iznajmljivanje;
import utils.MySqlUtils;


public class iznajmljivanjeController implements Initializable {
    


    @FXML
    private TableColumn<Iznajmljivanje, Date> datumdo;

    @FXML
    private TableColumn<Iznajmljivanje, Date> datumod;

    @FXML
    private TableColumn<Iznajmljivanje, Integer> id;

    @FXML
    private TableColumn<Iznajmljivanje, String> jmb;

    @FXML
    private TableColumn<Iznajmljivanje, String> jmbz;

    @FXML
    private TableColumn<Iznajmljivanje, String> registracija;

    @FXML
    private TableView<Iznajmljivanje> table;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listIznajmljivanja();
	}
    
	public void listIznajmljivanja() {
		ObservableList<Iznajmljivanje> observableList = FXCollections.observableArrayList();
		MySqlUtils.citajIznajmljivanja(observableList);
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		jmb.setCellValueFactory(new PropertyValueFactory<>("jbm"));
		datumod.setCellValueFactory(new PropertyValueFactory<>("datumPreuzimanja"));
		datumdo.setCellValueFactory(new PropertyValueFactory<>("datumDo"));
		registracija.setCellValueFactory(new PropertyValueFactory<>("Registracija"));

		table.setItems(observableList);
	}

    

}
