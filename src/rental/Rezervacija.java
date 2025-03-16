package rental;
import java.util.Date;

public class Rezervacija {
	
	private Date datumPreuzimanja;
	private Date datumRazduzovanja;
	private String registracija;
	private String JMB;
	
	public Rezervacija(Date datumPreuzimanja, Date datumRazduzovanja, String registracija, String jMB) {
		
		this.datumPreuzimanja = datumPreuzimanja;
		this.datumRazduzovanja = datumRazduzovanja;
		this.registracija = registracija;
		this.JMB = jMB;
	}

	public Date getDatumPreuzimanja() {
		return datumPreuzimanja;
	}

	public void setDatumPreuzimanja(Date datumPreuzimanja) {
		this.datumPreuzimanja = datumPreuzimanja;
	}

	public Date getDatumRazduzovanja() {
		return datumRazduzovanja;
	}

	public void setDatumRazduzovanja(Date datumRazduzovanja) {
		this.datumRazduzovanja = datumRazduzovanja;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public String getJMB() {
		return JMB;
	}

	public void setJMB(String jMB) {
		JMB = jMB;
	}
	
	
	

}
