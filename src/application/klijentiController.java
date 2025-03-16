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
import javafx.scene.control.ListView;
import rental.ConnectionPool;
import rental.Klijent;

public class klijentiController implements Initializable{


    @FXML
    private ListView<Klijent> listaKlijenata;
	    

	    @Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		listaKlijenata.getItems().addAll(selectAll());
	    }
		
		private static final String SQL_SELECT_ALL = "SELECT * FROM klijent";
		
		public static List<Klijent> selectAll()
		{
			List<Klijent> retVal = new ArrayList<Klijent>();	
			Connection c=null;
			Statement s=null;
			ResultSet rs=null;
			try {	
				c=ConnectionPool.getInstance().checkOut();		
				s= c.createStatement();
				rs=s.executeQuery(SQL_SELECT_ALL);			
				while(rs.next())
				{
					retVal.add(new Klijent(rs.getString(1),rs.getString(2), rs.getString(3)));
				}
			} catch (SQLException e){
				e.printStackTrace();	
			}	
			/* rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8)*/
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
