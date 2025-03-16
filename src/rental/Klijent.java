package rental;

import java.util.Date;

public class Klijent extends Osoba {
	
	private String id;
	private String brojTelefona;
	private String brojVozacke;
	

	public Klijent()
	{
		super();
	}

	public Klijent(String id2, String brojTelefona, String brojVozacke) {
	   
		this.id = id2;
		this.brojTelefona = brojTelefona;
		this.brojVozacke = brojVozacke;
	}

	public Klijent(Integer id, String grad, String ulica, Integer br, String jMB, String ime, String prezime,
			Date datumRodjenja) {
		super(id, grad, ulica, br, jMB, ime, prezime, datumRodjenja);
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getBrojVozacke() {
		return brojVozacke;
	}

	public void setBrojVozacke(String brojVozacke) {
		this.brojVozacke = brojVozacke;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	

}