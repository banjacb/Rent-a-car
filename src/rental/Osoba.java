package rental;
import java.util.Date;

public class Osoba  {

	private String JMB;
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private Lokacija lokacija;
	
	
public Osoba()
{
	super();
}

	public Osoba(Integer id, String grad, String ulica, Integer br,Lokacija lokacija) {
		
	}



	public Osoba(Integer id, String grad, String ulica, Integer br, String jMB, String ime, String prezime,
			Date datumRodjenja) {
		JMB = jMB;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;

	}



	public Lokacija getLokacija() {
		return lokacija;
	}



	public void setLokacija(Lokacija lokacija) {
		this.lokacija = lokacija;
	}



	public String getJMB() {
		return JMB;
	}



	public void setJMB(String jMB) {
		JMB = jMB;
	}



	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}



	public Date getDatumRodjenja() {
		return datumRodjenja;
	}



	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	

	
	
	
	
}
