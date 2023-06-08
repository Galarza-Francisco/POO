package ejercicio;

public class Frontera {
	private Pais pais1;
	private Pais pais2;
	private String tipo;

	public Frontera(Pais pais1, Pais pais2, String tipo) {
		super();
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.tipo = tipo;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Frontera [pais1=" + pais1 + ", pais2=" + pais2 + ", tipo=" + tipo + "]";
	}

}
