package rental;

public class ServisVozila{
	
	private Integer id;
	private String naziv;
	private Integer idLokacija;
	
	public ServisVozila(Integer id, String naziv, Integer idLokacija) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.idLokacija = idLokacija;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getIdLokacija() {
		return idLokacija;
	}

	public void setIdLokacija(Integer idLokacija) {
		this.idLokacija = idLokacija;
	}
	
	
	
	
	
	

}
