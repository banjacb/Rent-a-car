package application;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import rental.Auto;
import rental.ConnectionPool;

import java.util.ArrayList;
import java.util.List;


public class viewAutoController implements Initializable {
	
	@FXML
    private ListView<Auto> lista;

    @FXML
    private javafx.scene.control.Button iznajmi;
    
    void select(ActionEvent event) {

    }
   
	
	 @FXML
	 private Label info;
	 
	 @FXML
	    private TextField textFiledRegistracija;


	 @FXML
	    void btnIznajmi(ActionEvent event)throws IOException, SQLException {
		
		 Parent root = FXMLLoader.load(getClass().getResource("iznajmljivanje.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		
	    }

	
   
    @FXML
    void radSaKlijentima(ActionEvent event) throws IOException {
    	
    	 
		 Parent root = FXMLLoader.load(getClass().getResource("klijenti.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
	 }
    
    
 
    @FXML
    void btnRezerviziCllick(ActionEvent event) throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("rezervacije.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
    }
    
    
    
    @FXML
    void izbrisiAuto(ActionEvent event)
    {
		

    }

				
    
    

   
    @FXML
  void dodajAuto(ActionEvent event)  throws SQLException, IOException {
    	 Parent root = FXMLLoader.load(getClass().getResource("addAuto.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
    	 
    }
    	
    private static final String SQL_SELECT_ALL = "SELECT * FROM  AUTO";
    public static List<Auto> selectAll()
	{
		List<Auto> retVal = new ArrayList<Auto>();	
		Connection c=null;
		Statement s=null;
		ResultSet rs=null;
		
		try {	
			c=ConnectionPool.getInstance().checkOut();		
			s= c.createStatement();
			rs=s.executeQuery(SQL_SELECT_ALL);			
			while(rs.next())
			{
				retVal.add(new Auto(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getDate(5), rs.getDouble(6), null, null, null));
			}
		} catch (SQLException e){
			e.printStackTrace();	
		}	
		finally
		{
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(s != null)
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(c != null)
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		ConnectionPool.getInstance().checkIn(c);
		return retVal;	
	}
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lista.getItems().addAll(selectAll());
		
	}
}
   
 

	

   


