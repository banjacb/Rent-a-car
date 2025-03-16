package rental;

import java.util.Date;

public class Iznajmljivanje {
	
	private Integer id;
	private String jmb;
	private Date datumPrezuzimanja;
	private Date datumDo;
	private String Registracija;
	
	public Iznajmljivanje(Integer id, String jmb, Date datumPrezuzimanja, Date datumDo, String zaposleniJmb,
			String registracija) {
		super();
		this.id = id;
		this.jmb = jmb;
		this.datumPrezuzimanja = datumPrezuzimanja;
		this.datumDo = datumDo;
		
		Registracija = registracija;
	}

	public Iznajmljivanje(Integer id, String jmb, Date datumPrezuzimanja, Date datumDo, String registracija) {
		super();
		this.id = id;
		this.jmb = jmb;
		this.datumPrezuzimanja = datumPrezuzimanja;
		this.datumDo = datumDo;
		Registracija = registracija;
	}

	public Iznajmljivanje(String jmb, Date datumPrezuzimanja, Date datumDo, String zaposleniJmb, String registracija) {
		super();
		this.jmb = jmb;
		this.datumPrezuzimanja = datumPrezuzimanja;
		this.datumDo = datumDo;
		
		Registracija = registracija;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJmb() {
		return jmb;
	}

	public void setJmb(String jmb) {
		this.jmb = jmb;
	}

	public Date getDatumPrezuzimanja() {
		return datumPrezuzimanja;
	}

	public void setDatumPrezuzimanja(Date datumPrezuzimanja) {
		this.datumPrezuzimanja = datumPrezuzimanja;
	}

	public Date getDatumDo() {
		return datumDo;
	}

	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
	}


	public String getRegistracija() {
		return Registracija;
	}

	public void setRegistracija(String registracija) {
		Registracija = registracija;
	}
	
	
	
	
	
	

}
