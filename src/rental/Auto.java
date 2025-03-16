package rental;


import java.util.Date;


public class Auto {
	private String registracija;
	private String naziv;
	private String model;
	private String vrstaMjenjaca;
	private Date godinaPorizvodnje;
	private double Cijena_dan;
	private Integer idOsiguranje;
	private Integer idKategorija;
	private Integer idServis;
	
	public Auto(String registracija, String naziv, String model, String vrstaMjenjaca, Date godinaPorizvodnje, double Cijena_dan,
			Integer idOsiguranje, Integer idKategorija, Integer idServis) {
		super();
		this.registracija = registracija;
		this.naziv = naziv;
		this.model = model;
		this.vrstaMjenjaca = vrstaMjenjaca;
		this.godinaPorizvodnje = godinaPorizvodnje;
		this.Cijena_dan=Cijena_dan;
		this.idOsiguranje = idOsiguranje;
		this.idKategorija = idKategorija;
		this.idServis = idServis;
		
	}
	

	
	public Auto() {
		super();
		
	}


	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVrstaMjenjaca() {
		return vrstaMjenjaca;
	}

	public void setVrstaMjenjaca(String vrstaMjenjaca) {
		this.vrstaMjenjaca = vrstaMjenjaca;
	}

	public Date getGodinaPorizvodnje() {
		return godinaPorizvodnje;
	}

	public void setGodinaPorizvodnje(Date godinaPorizvodnje) {
		this.godinaPorizvodnje = godinaPorizvodnje;
	}

	public Integer getIdOsiguranje() {
		return idOsiguranje;
	}

	public void setIdOsiguranje(Integer idOsiguranje) {
		this.idOsiguranje = idOsiguranje;
	}

	public Integer getIdKategorija() {
		return idKategorija;
	}

	public void setIdKategorija(Integer idKategorija) {
		this.idKategorija = idKategorija;
	}

	public Integer getIdServis() {
		return idServis;
	}

	public void setIdServis(Integer idServis) {
		this.idServis = idServis;
	}


	
	public double getCijena_dan() {
		return Cijena_dan;
	}

	public void setCijena_dan(double cijena_dan) {
		Cijena_dan = cijena_dan;
	}


	@Override
	public String toString() {
		return registracija + ", " + naziv + ", " + model + ", "
				+ vrstaMjenjaca + ", " + godinaPorizvodnje + ", " + Cijena_dan
				+ "KM, " ;
	}

	
	

}

