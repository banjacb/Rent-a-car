package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import rental.ConnectionPool;
import rental.Rezervacija;

public class rezervacijeController implements Initializable {
	
    @FXML
    private ListView<Rezervacija> listaRezervacija;

    @FXML
    private Label rervacije;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listaRezervacija.getItems().addAll(selectAll());
		
	}
    

    private static final String SQL_SELECT_ALL = "SELECT * FROM  rezervacija";
    public static List<Rezervacija> selectAll()
	{
		List<Rezervacija> retVal = new ArrayList<Rezervacija>();	
		Connection c=null;
		Statement s=null;
		ResultSet rs=null;
		
		try {	
			c=ConnectionPool.getInstance().checkOut();		
			s= c.createStatement();
			rs=s.executeQuery(SQL_SELECT_ALL);			
			while(rs.next())
			{
				retVal.add(new Rezervacija(rs.getDate(1),rs.getDate(2), rs.getString(3), rs.getString(4)));
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
    
}
