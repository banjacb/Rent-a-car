package rental;

public class Lokacija {

	private Integer id;
	private String grad;
	private String ulica;
	private Integer br;
	
	public Lokacija(Integer id, String grad, String ulica, Integer br) {
		super();
		this.id = id;
		this.grad = grad;
		this.ulica = ulica;
		this.br = br;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public Integer getBr() {
		return br;
	}

	public void setBr(Integer br) {
		this.br = br;
	}


	
	
	
	
	
	
}
