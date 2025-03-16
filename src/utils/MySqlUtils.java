package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Date;



import javafx.collections.ObservableList;

import rental.ConnectionPool;

public class MySqlUtils {
	
	public static void addAuto(String registracija, String naziv, String model, String vrstaMjenjaca, Date godinaPorizvodnje, double Cijena_dan,
			Integer idOsiguranje, Integer idKategorija, Integer idServis)
	{
		Connection c;
		PreparedStatement ps;
		
		
		
			try {
				c=ConnectionPool.getInstance().checkOut();
				ps=c.prepareStatement("insert into Auto values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1, registracija);
				ps.setString(2, naziv);
				ps.setString(3, model);
				ps.setString(4, vrstaMjenjaca);
				ps.setDate(5, (java.sql.Date) godinaPorizvodnje);
				ps.setDouble(6, Cijena_dan);
				ps.setInt(7, idOsiguranje);
				ps.setInt(8, idKategorija);
				ps.setInt(9, idServis);
				ps.executeUpdate();
				
				ConnectionPool.getInstance().checkIn(c);
				
			} catch(SQLException e)
			{
			e.printStackTrace();
			}
		
	}
	

	public static boolean deleteAuto(String id) {
		Connection c;
		PreparedStatement ps;

		try {
			c = ConnectionPool.getInstance().checkOut();
			ps = c.prepareStatement("delete from Auto where registracija=?");
			ps.setString(1, id);
			ps.executeUpdate();

			ConnectionPool.getInstance().checkIn(c);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public static void citajIznajmljivanja(ObservableList<rental.Iznajmljivanje> lista) {
		Connection c;
		PreparedStatement ps;
		ResultSet rs;

		try {
			c = ConnectionPool.getInstance().checkOut();
			ps = c.prepareStatement(
					"select * from iznajmljivanje");
			rs = ps.executeQuery();

			while (rs.next()) {

				lista.add(new rental.Iznajmljivanje(rs.getInt(1),rs.getString(2), rs.getDate(3), rs.getDate(4),rs.getString(5)));

			}

			ConnectionPool.getInstance().checkIn(c);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
