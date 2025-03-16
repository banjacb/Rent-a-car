package rental;

public class Kategorija {

	private Integer idKategorija;
	private String naziv;
	
	public Kategorija() {
		super();
	}

	public Kategorija(String naziv) {
		super();
		this.naziv = naziv;
	}

	public Kategorija(Integer idKategorija, String naziv) {
		super();
		this.idKategorija = idKategorija;
		this.naziv = naziv;
	}

	public Integer getIdKategorija() {
		return idKategorija;
	}

	public void setIdKategorija(Integer idKategorija) {
		this.idKategorija = idKategorija;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Kategorija [idKategorija=" + idKategorija + ", naziv=" + naziv + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idKategorija == null) ? 0 : idKategorija.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kategorija other = (Kategorija) obj;
		if (idKategorija == null) {
			if (other.idKategorija != null)
				return false;
		} else if (!idKategorija.equals(other.idKategorija))
			return false;
		return true;
	}
	
	
	
	

}
